package parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;

import domain.Entity;
import domain.FState;
import domain.ObjectRecord;
import domain.Record;
import domain.RecordFieldValue;
import domain.Set;
import domain.SetElement;
import domain.State;
import domain.StateElement;

public class VisitorOrientedParser {

    public State parse(String s) {
        CharStream charStream = CharStreams.fromString(s);
        TLALexer lexer = new TLALexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        TLAParser parser = new TLAParser(tokens);

        TLAStateVisitor visitor = new TLAStateVisitor();

        return visitor.visit(parser.state());
    }

    public static class TLAStateVisitor extends TLABaseVisitor<State> {
        @Override
        public State visitState(TLAParser.StateContext ctx) {
            StateElementVisitor stateElementVisitor = new StateElementVisitor();
            List<StateElement> stateElements = new ArrayList<>();

            for (TLAParser.StateElementContext elemCtx : ctx.stateElement())
                stateElements.add(elemCtx.accept(stateElementVisitor));

            return new State(ctx.getText(), stateElements);
        }
    }

    public static class StateElementVisitor extends TLABaseVisitor<StateElement> {
        @Override
        public StateElement visitStateElement(TLAParser.StateElementContext ctx) {
            FStateVisitor fStateVisitor = new FStateVisitor();
            FState fState = ctx.fState() != null ? ctx.accept(fStateVisitor) : null;

            List<TLAParser.EntityContext> entitiesCtx = ctx.entity() != null ? ctx.entity() : null;
            Map<String, Entity> entities = null;

            if (entitiesCtx != null && !entitiesCtx.isEmpty()) {
                EntityVisitor entityVisitor = new EntityVisitor();
                entities = new HashMap<>();

                for (TLAParser.EntityContext entityCtx : entitiesCtx) {
                    Entity e = entityCtx.accept(entityVisitor);
                    entities.put(e.getName(), e);
                }
            }

            return new StateElement(fState, entities);
        }
    }

    public static class FStateVisitor extends TLABaseVisitor<FState> {
        @Override
        public FState visitFState(TLAParser.FStateContext ctx) {
            boolean f = Boolean.parseBoolean(ctx.BOOLEAN().getText());
            return new FState(f);
        }
    }

    public static class EntityVisitor extends TLABaseVisitor<Entity> {
        @Override
        public Entity visitEntity(TLAParser.EntityContext ctx) {
            String name = ctx.STRING().getText();
            boolean emptyMap = ctx.EMPTY_MAP() != null;

            Map<String, Record> records = new HashMap<>();

            if (!emptyMap) {
                List<TLAParser.MapElementContext> elemsCtx = ctx.map().mapElement();
                RecordVisitor recordVisitor = new RecordVisitor();

                String recordId;
                for (TLAParser.MapElementContext elemCtx : elemsCtx) {
                    recordId = elemCtx.STRING().getText();
                    Record r = elemCtx.record().accept(recordVisitor);
                    r.setId(recordId);
                    records.put(recordId, r);
                }
            }

            return new Entity(name, records);
        }
    }

    public static class ObjectRecordVisitor extends TLABaseVisitor<ObjectRecord> {
        @Override
        public ObjectRecord visitObjectRecord(TLAParser.ObjectRecordContext ctx) {
            List<Record> records = new ArrayList<>();
            List<String> strRecords = new ArrayList<>();

            for (TLAParser.RecordContext r : ctx.record()) {
                Map<String, RecordFieldValue> elems = new HashMap<>();

                for (TLAParser.RecordElementContext e : r.recordElement()) {
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

    public static class RecordFieldValueVisitor extends TLABaseVisitor<RecordFieldValue> {
        @Override
        public RecordFieldValue visitFieldValue(TLAParser.FieldValueContext ctx) {
            String str = ctx.STRING() != null ? ctx.STRING().getText() : null;
            Integer num = ctx.NAT() != null ? Integer.parseInt(ctx.NAT().getText()) : null;
            Boolean bool = ctx.BOOLEAN() != null ? Boolean.parseBoolean(ctx.BOOLEAN().getText()) : null;

            SetVisitor setVisitor = new SetVisitor();
            Set set = ctx.set() != null ? ctx.set().accept(setVisitor) : null;

            return new RecordFieldValue(str, num, bool, set);
        }
    }

    public static class SetVisitor extends TLABaseVisitor<Set> {
        @Override
        public Set visitSet(TLAParser.SetContext ctx) {
            List<SetElement> setElements = new ArrayList<>();
            SetElementVisitor setElementVisitor = new SetElementVisitor();

            for (TLAParser.SetElementContext e : ctx.setElement())
                setElements.add(e.accept(setElementVisitor));

            return new Set(setElements);
        }
    }

    public static class SetElementVisitor extends TLABaseVisitor<SetElement> {
        @Override
        public SetElement visitSetElement(TLAParser.SetElementContext ctx) {
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

                for (TLAParser.RecordContext r : ctx.record())
                    recordElems.add(r.accept(recordVisitor));
            }

            return new SetElement(strElems, intElems, recordElems);
        }
    }

    public static class RecordVisitor extends TLABaseVisitor<Record> {
        @Override
        public Record visitRecord(TLAParser.RecordContext ctx) {
            RecordFieldValueVisitor fieldValueVisitor = new RecordFieldValueVisitor();
            Map<String, RecordFieldValue> elems = new HashMap<>();

            String name;
            RecordFieldValue value;
            for (TLAParser.RecordElementContext e : ctx.recordElement()) {
                name = e.STRING().getText();
                value = e.fieldValue().accept(fieldValueVisitor);
                elems.put(name, value);
            }

            return new Record(elems);
        }
    }

}
