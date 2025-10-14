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
            FStateVisitor fStateVisitor = new FStateVisitor();
            EntityVisitor entityVisitor = new EntityVisitor();

            FState f;
            Map<String, Entity> allEntities = new HashMap<>();
            List<StateElement> stateElements = new ArrayList<>();

            for (TLAParser.StateElementContext elemCtx : ctx.stateElement()) {
                if (elemCtx.fState() != null) {
                    f = fStateVisitor.visit(elemCtx.fState());
                    stateElements.add(new StateElement(f, null));
                }

                for (TLAParser.EntityContext entityCtx : elemCtx.entity()) {
                    Entity e = entityVisitor.visit(entityCtx);
                    allEntities.put(e.getName(), e);
                }
            }
            stateElements.add(new StateElement(null, allEntities));

            return new State(ctx.getText(), stateElements);
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

            SetVisitor setVisitor = new SetVisitor();
            TLAParser.SetContext setCtx = ctx.set() != null ? ctx.set() : null;
            Set set = setCtx != null ? setCtx.accept(setVisitor) : null;

            boolean emptyMap = ctx.EMPTY_MAP() != null;
            Map<String, Record> records = new HashMap<>();
            Map<String, RecordFieldValue> values = new HashMap<>();

            TLAParser.MapContext mapCtx = ctx.map() != null ? ctx.map() : null;
            if (!emptyMap && mapCtx != null) {
                List<TLAParser.MapElementContext> elemsCtx = mapCtx.mapElement();
                RecordVisitor recordVisitor = new RecordVisitor();

                String recordId;
                for (TLAParser.MapElementContext elemCtx : elemsCtx) {
                    recordId = elemCtx.STRING(0).getText();
                    if (elemCtx.record() != null) {
                        Record r = elemCtx.record().accept(recordVisitor);
                        r.setId(recordId);
                        records.put(recordId, r);
                    } else {
                        RecordFieldValue value = new RecordFieldValue(elemCtx.STRING(1).getText(), null, null, null);
                        values.put(recordId, value);
                    }
                }
            }

            return new Entity(name, records, set, values);
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

            for (TLAParser.SetElementContext e : ctx.setElement()) {
                setElements.add(e.accept(setElementVisitor));
            }

            return new Set(setElements);
        }
    }

    public static class SetElementVisitor extends TLABaseVisitor<SetElement> {
        @Override
        public SetElement visitSetElement(TLAParser.SetElementContext ctx) {
            List<String> strElems = new ArrayList<>();
            List<Integer> intElems = new ArrayList<>();
            List<Record> recordElems = new ArrayList<>();

            if (ctx.STRING() != null) {
                for (TerminalNode s : ctx.STRING()) {
                    strElems.add(s.getText());
                }
            }

            if (ctx.NAT() != null) {
                for (TerminalNode i : ctx.NAT()) {
                    intElems.add(Integer.parseInt(i.getText()));
                }
            }

            if (ctx.record() != null) {
                RecordVisitor recordVisitor = new RecordVisitor();

                for (TLAParser.RecordContext r : ctx.record()) {
                    recordElems.add(r.accept(recordVisitor));
                }
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
