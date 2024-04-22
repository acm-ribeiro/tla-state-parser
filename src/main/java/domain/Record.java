package domain;

import java.util.Map;
import java.util.Map.Entry;

public class Record {

    private Map<String, RecordFieldValue> elems;

    public Record(Map<String, RecordFieldValue> elems) {
        this.elems = elems;
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
            s.append("        " + e.getKey() + " = " + e.getValue() + "\n");

        s.deleteCharAt(s.length()-1);
        s.append("      }\n");

        return s.toString();
    }
}
