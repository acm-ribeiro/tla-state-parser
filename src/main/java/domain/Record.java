package domain;

import java.util.Map;
import java.util.Map.Entry;

public class Record {

    private String id;
    private final Map<String, RecordFieldValue> elems;

    public Record(Map<String, RecordFieldValue> elems) {
        this.elems = elems;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, RecordFieldValue> getElems() {
        return elems;
    }

    public RecordFieldValue getElement(String name) {
        return elems.getOrDefault(name, null);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        for(Entry<String, RecordFieldValue> e : elems.entrySet())
            s.append("        ").append(e.getKey()).append(" = ").append(e.getValue()).append("\n");

        s.deleteCharAt(s.length()-1);
        s.append("      }\n");

        return s.toString();
    }
}
