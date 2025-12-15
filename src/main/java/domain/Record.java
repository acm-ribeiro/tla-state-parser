package domain;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Record {

    private String id;
    private final List<RecordElement> elems;

    public Record(List<RecordElement> elems) {
        this.elems = elems;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<RecordElement> getElems() {
        return elems;
    }

    public RecordFieldValue getElement(String name) {
        for(RecordElement elem : elems) {
            if(elem.getName().equals(name)) {
                return elem.getValue();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        for(RecordElement e : elems)
            s.append("        ").append(e.getName()).append(" = ").append(e.getValue()).append("\n");

        s.append("      }");

        return s.toString();
    }
}
