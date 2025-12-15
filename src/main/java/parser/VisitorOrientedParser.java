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
import domain.MapElement;
import domain.Record;
import domain.RecordElement;
import domain.RecordFieldValue;
import domain.Set;
import domain.SetElement;
import domain.State;
import domain.StateElement;
import domain.TLAMap;

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

            TLAParser.MapContext mapCtx = ctx.map() != null ? ctx.map() : null;
            TLAMap tlaMap = mapCtx != null && !emptyMap? new MapVisitor().visit(mapCtx) : null;

            return new Entity(name, tlaMap, set, emptyMap);
        }
    }

    public static class MapVisitor extends TLABaseVisitor<TLAMap> {
        @Override
        public TLAMap visitMap(TLAParser.MapContext ctx) {
            List<TLAParser.MapElementContext> elemsCtx = ctx.mapElement();
            MapElementVisitor mapElementVisitor = new MapElementVisitor();
            List<MapElement> elements = new ArrayList<>(elemsCtx.size());

            for (TLAParser.MapElementContext elem : elemsCtx) {
                MapElement mapElem = mapElementVisitor.visit(elem);
                elements.add(mapElem);
            }

            return new TLAMap(elements);
        }
    }

    public static class MapElementVisitor extends TLABaseVisitor<MapElement> {
        @Override
        public MapElement visitMapElement(TLAParser.MapElementContext ctx) {
            String key = ctx.STRING(0).getText();

            RecordVisitor recordVisitor = new RecordVisitor();
            Record recordValue = ctx.record() != null ? ctx.record().accept(recordVisitor) : null;

            SetVisitor setVisitor = new SetVisitor();
            Set setValue = ctx.set() != null ? ctx.set().accept(setVisitor) : null;

            String strValue = ctx.STRING(1) != null ? ctx.STRING(1).getText() : null;

            return new MapElement(key, strValue, recordValue, setValue);
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

            boolean emptyMap = ctx.EMPTY_MAP() != null;

            MapVisitor mapVisitor = new MapVisitor();
            TLAMap tlaMap = ctx.map() != null ? ctx.map().accept(mapVisitor) : null;

            return new RecordFieldValue(str, num, bool, set, tlaMap, emptyMap);
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
            RecordElementVisitor recordElementVisitor = new RecordElementVisitor();
            List<RecordElement> elems = new ArrayList<>();

            RecordElement recordElem;
            for (TLAParser.RecordElementContext e : ctx.recordElement()) {
                recordElem = recordElementVisitor.visit(e);
                elems.add(recordElem);
            }

            return new Record(elems);
        }
    }

    public static class RecordElementVisitor extends TLABaseVisitor<RecordElement> {
        @Override
        public RecordElement visitRecordElement(TLAParser.RecordElementContext ctx) {
            String name = ctx.STRING().getText();
            RecordFieldValueVisitor fieldValueVisitor = new RecordFieldValueVisitor();
            RecordFieldValue value = ctx.fieldValue() != null? ctx.fieldValue().accept(fieldValueVisitor) : null;

            return new RecordElement(name, value);
        }
    }
}
