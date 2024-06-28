package parser;

import domain.*;
import domain.Record;
import domain.Set;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class VisitorOrientedParser {

    public State parse(String s) {
        CharStream charStream = CharStreams.fromString(s);
        TLAStateLexer lexer = new TLAStateLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        TLAStateParser parser = new TLAStateParser(tokens);

        TLAStateVisitor visitor = new TLAStateVisitor();

        return visitor.visit(parser.state());
    }

    public static class TLAStateVisitor extends TLAStateBaseVisitor<State> {
        @Override
        public State visitState(TLAStateParser.StateContext ctx) {
            StateElementVisitor stateElementVisitor = new StateElementVisitor();
            List<StateElement> stateElements = new ArrayList<>();

            for (TLAStateParser.StateElementContext elemCtx : ctx.stateElement())
                stateElements.add(elemCtx.accept(stateElementVisitor));


            return new State(stateElements);
        }
    }

    public static class StateElementVisitor extends TLAStateBaseVisitor<StateElement> {
        @Override
        public StateElement visitStateElement(TLAStateParser.StateElementContext ctx) {
            FStateVisitor fStateVisitor = new FStateVisitor();
            FState fState = ctx.fState() != null ? ctx.accept(fStateVisitor) : null;

            PCStateVisitor pcStateVisitor = new PCStateVisitor();
            PCState pcState = ctx.pcState() != null ? ctx.accept(pcStateVisitor) : null;

            ReqStateVisitor reqStateVisitor = new ReqStateVisitor();
            RequestState reqState = ctx.reqState() != null ? ctx.accept(reqStateVisitor) : null;

            ResStateVisitor resStateVisitor = new ResStateVisitor();
            ResponseState resState = ctx.resState() != null ? ctx.accept(resStateVisitor) : null;

            List<TLAStateParser.EntityContext> entitiesCtx = ctx.entity() != null ? ctx.entity() : null;
            Map<String, Entity> entities = null;

            if (entitiesCtx != null && !entitiesCtx.isEmpty()) {
                EntityVisitor entityVisitor = new EntityVisitor();
                entities = new HashMap<>();

                for (TLAStateParser.EntityContext entityCtx : entitiesCtx) {
                    Entity e = entityCtx.accept(entityVisitor);
                    entities.put(e.getName(), e);
                }
            }

            TagStateVisitor tagStateVisitor = new TagStateVisitor();
            TagState tagState = ctx.tagState() != null ? ctx.accept(tagStateVisitor) : null;

            SchemaMappingVisitor schemaMappingVisitor = new SchemaMappingVisitor();
            SchemaMapping schemaMapping = ctx.schemaMapping() != null? ctx.accept(schemaMappingVisitor) : null;

            return new StateElement(fState, pcState, reqState, resState, entities, tagState, schemaMapping);
        }
    }

    public static class SchemaMappingVisitor extends TLAStateBaseVisitor<SchemaMapping> {
        @Override
        public SchemaMapping visitSchemaMapping(TLAStateParser.SchemaMappingContext ctx) {
            RecordVisitor recordVisitor = new RecordVisitor();
            Record record = ctx.record() != null? ctx.accept(recordVisitor) : null;

            return new SchemaMapping(record);
        }
    }

    public static class TagStateVisitor extends TLAStateBaseVisitor<TagState> {
        @Override
        public TagState visitTagState(TLAStateParser.TagStateContext ctx) {
            List<String> tags = new LinkedList<>();

            for (TerminalNode t : ctx.tags().STRING())
                tags.add(t.getText());

            return new TagState(tags);
        }
    }

    public static class EntityVisitor extends TLAStateBaseVisitor<Entity> {
        @Override
        public Entity visitEntity(TLAStateParser.EntityContext ctx) {
            String name = ctx.STRING().getText();
            Map<String, Record> records = new HashMap<>();

            List<TLAStateParser.MapElementContext> elemsCtx = ctx.map().mapElement();
            RecordVisitor recordVisitor = new RecordVisitor();

            for (TLAStateParser.MapElementContext elemCtx : elemsCtx) {
                Record r = elemCtx.record().accept(recordVisitor);
                String key = elemCtx.STRING().getText();
                records.put(key, r);
            }

            return new Entity(name, records);
        }
    }

    public static class ResStateVisitor extends TLAStateBaseVisitor<ResponseState> {
        @Override
        public ResponseState visitResState(TLAStateParser.ResStateContext ctx) {
            ResponseRecordVisitor responseRecordVisitor = new ResponseRecordVisitor();
            Response res = ctx.responseRecord().accept(responseRecordVisitor);
            return new ResponseState(res);
        }
    }

    public static class ResponseRecordVisitor extends TLAStateBaseVisitor<Response> {
        @Override
        public Response visitResponseRecord(TLAStateParser.ResponseRecordContext ctx) {
            Integer code = ctx.code().codeID().CODE() != null ?
                    Integer.parseInt(ctx.code().codeID().CODE().getText()) : null;

            BodyVisitor bodyVisitor = new BodyVisitor();
            Body body = ctx.body().accept(bodyVisitor);

            return new Response(code, body);
        }
    }

    public static class FStateVisitor extends TLAStateBaseVisitor<FState> {
        @Override
        public FState visitFState(TLAStateParser.FStateContext ctx) {
            boolean f = Boolean.parseBoolean(ctx.BOOLEAN().getText());
            return new FState(f);
        }
    }

    public static class PCStateVisitor extends TLAStateBaseVisitor<PCState> {
        @Override
        public PCState visitPcState(TLAStateParser.PcStateContext ctx) {
            boolean pc = Boolean.parseBoolean(ctx.BOOLEAN().getText());
            return new PCState(pc);
        }
    }

    public static class ReqStateVisitor extends TLAStateBaseVisitor<RequestState> {
        @Override
        public RequestState visitReqState(TLAStateParser.ReqStateContext ctx) {
            RequestRecordVisitor requestRecordVisitor = new RequestRecordVisitor();
            Request request = ctx.requestRecord() != null ? ctx.accept(requestRecordVisitor) : null;
            return new RequestState(request);
        }
    }

    public static class RequestRecordVisitor extends TLAStateBaseVisitor<Request> {
        @Override
        public Request visitRequestRecord(TLAStateParser.RequestRecordContext ctx) {
            String operationId = ctx.operation().operationID().getText();
            String verb = ctx.verb().verbID().getText();

            // If there are any parameters
            List<Parameter> parameters = new ArrayList<>();
            if (!ctx.parameters().paramRecord().get(0).getText().isBlank())
                for (TLAStateParser.ParamRecordContext p : ctx.parameters().paramRecord()) {
                    String name = p.STRING(0).getText();
                    String value = p.STRING(1).getText();
                    parameters.add(new Parameter(name, value));
                }

            BodyVisitor bodyVisitor = new BodyVisitor();
            Body body = ctx.body() != null ? ctx.body().accept(bodyVisitor) : null;

            return new Request(operationId, verb, parameters, body);
        }
    }

    public static class BodyVisitor extends TLAStateBaseVisitor<Body> {
        @Override
        public Body visitBody(TLAStateParser.BodyContext ctx) {
            List<BodyRecord> bodyRecords = new ArrayList<>();
            List<TLAStateParser.BodyRecordContext> records = ctx.bodyRecord();

            // If the body has records
            if (!records.get(0).getText().isBlank()) {
                BodyRecordVisitor bodyRecordVisitor = new BodyRecordVisitor();
                for (TLAStateParser.BodyRecordContext r : records) {
                    BodyRecord bodyRecord = r.accept(bodyRecordVisitor);
                    bodyRecords.add(bodyRecord);
                }
            }

            return new Body(bodyRecords);
        }
    }

    public static class BodyRecordVisitor extends TLAStateBaseVisitor<BodyRecord> {
        @Override
        public BodyRecord visitBodyRecord(TLAStateParser.BodyRecordContext ctx) {
            String type = ctx.bodyType().RTYPE().getText();
            int num = Integer.parseInt(ctx.bodyInt().NAT().getText());
            boolean bool = Boolean.parseBoolean(ctx.bodyBool().BOOLEAN().getText());

            ObjectRecordVisitor objectRecordVisitor = new ObjectRecordVisitor();
            ObjectRecord obj = ctx.bodyObject().objectRecord().accept(objectRecordVisitor);

            return new BodyRecord(type, num, bool, obj);
        }
    }

    public static class ObjectRecordVisitor extends TLAStateBaseVisitor<ObjectRecord> {
        @Override
        public ObjectRecord visitObjectRecord(TLAStateParser.ObjectRecordContext ctx) {
            List<Record> records = new ArrayList<>();
            List<String> strRecords = new ArrayList<>();

            for (TLAStateParser.RecordContext r : ctx.record()) {
                Map<String, RecordFieldValue> elems = new HashMap<>();

                for (TLAStateParser.RecordElementContext e : r.recordElement()) {
                    String name = e.STRING().getText();

                    RecordFieldValueVisitor recordFieldValueVisitor = new RecordFieldValueVisitor();
                    RecordFieldValue value = e.fieldValue().accept(recordFieldValueVisitor);
                    elems.put(name, value);
                }
                records.add(new Record(elems));
            }

            for (TerminalNode str : ctx.STRING())
                strRecords.add(str.getText());

            return new ObjectRecord(records, strRecords);
        }
    }

    public static class RecordFieldValueVisitor extends TLAStateBaseVisitor<RecordFieldValue> {
        @Override
        public RecordFieldValue visitFieldValue(TLAStateParser.FieldValueContext ctx) {
            String str = ctx.STRING() != null ? ctx.STRING().getText() : null;
            Integer num = ctx.NAT() != null ? Integer.parseInt(ctx.NAT().getText()) : null;
            Boolean bool = ctx.BOOLEAN() != null ? Boolean.parseBoolean(ctx.BOOLEAN().getText()) : null;

            SetVisitor setVisitor = new SetVisitor();
            Set set = ctx.set() != null ? ctx.set().accept(setVisitor) : null;

            return new RecordFieldValue(str, num, bool, set);
        }
    }

    public static class SetVisitor extends TLAStateBaseVisitor<Set> {
        @Override
        public Set visitSet(TLAStateParser.SetContext ctx) {
            List<SetElement> setElements = new ArrayList<>();
            SetElementVisitor setElementVisitor = new SetElementVisitor();

            for (TLAStateParser.SetElementContext e : ctx.setElement())
                setElements.add(e.accept(setElementVisitor));

            return new Set(setElements);
        }
    }

    public static class SetElementVisitor extends TLAStateBaseVisitor<SetElement> {
        @Override
        public SetElement visitSetElement(TLAStateParser.SetElementContext ctx) {
            List<String> strElems = new ArrayList<>();
            List<Integer> intElems = new ArrayList<>();
            List<Record> recordElems = new ArrayList<>();

            if (ctx.STRING() != null)
                for (TerminalNode s : ctx.STRING())
                    strElems.add(s.getText());

            if (ctx.NAT() != null)
                for (TerminalNode i : ctx.NAT())
                    intElems.add(Integer.parseInt(i.getText()));

            if (ctx.record() != null) {
                RecordVisitor recordVisitor = new RecordVisitor();

                for (TLAStateParser.RecordContext r : ctx.record())
                    recordElems.add(r.accept(recordVisitor));
            }

            return new SetElement(strElems, intElems, recordElems);
        }
    }

    public static class RecordVisitor extends TLAStateBaseVisitor<Record> {
        @Override
        public Record visitRecord(TLAStateParser.RecordContext ctx) {
            RecordFieldValueVisitor fieldValueVisitor = new RecordFieldValueVisitor();
            Map<String, RecordFieldValue> elems = new HashMap<>();

            String name;
            RecordFieldValue value;
            for (TLAStateParser.RecordElementContext e : ctx.recordElement()) {
                name = e.STRING().getText();
                value = e.fieldValue().accept(fieldValueVisitor);
                elems.put(name, value);
            }

            return new Record(elems);
        }
    }

}
