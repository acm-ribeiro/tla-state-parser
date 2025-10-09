package domain;

import java.util.Map;
import java.util.Map.Entry;

public class Entity {

    private final String name;
    private final Map<String, Record> records;
    private final Map<String, RecordFieldValue> values;
    private final Set set;

    // p = ( n1 :> [nif |-> n1, ts |-> {}, a |-> 0, s |-> FALSE] @@  n2 :> [nif |-> n2, ts |-> {}, a |-> 0, s |-> FALSE] )
    public Entity(String name, Map<String, Record> elements, Set set, Map<String, RecordFieldValue> values) {
        this.records = elements;
        this.name = name;
        this.set = set;
        this.values = values; // e.g., orders in petstore api
    }

    public int getNumRecords() {
        return records.size();
    }

    public Record getRecordById(String recordId) {
        return records.get(recordId);
    }

    public Map<String, Record> getRecords() {
        return records;
    }

    public Set getSet() {
        return set;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("    ").append(name).append(" = ");

        if (!records.isEmpty()){
            // To only print new line in between records
            s.append("<\n");
            int i = 0;
            int size = records.size();

            for (Entry<String, Record> e : records.entrySet()) {
                s.append("      ").append(e.getKey()).append(" = {\n").append(e.getValue().toString());

            }

            s.append("\n    >");
        } else if (!values.isEmpty()) {
            s.append("<");
            // to only print comma in between elements
            int i = 0;
            int size = values.size();

            for (Entry<String, RecordFieldValue> e : values.entrySet()) {
                s.append("(").append(e.getKey()).append(" :> ").append(e.getValue().toString()).append(")");
                if (++i < size)
                    s.append(", "); // newline only between elements
            }
            s.append(">");
        }
        else if (set != null) {
            s.append(set);
        } else {
            s.append("<<>>");
        }

        return s.toString();
    }
}
