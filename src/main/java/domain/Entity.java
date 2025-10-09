package domain;

import java.util.Map;
import java.util.Map.Entry;

public class Entity {

    private final String name;
    private final Map<String, Record> records;

    // p = ( n1 :> [nif |-> n1, ts |-> {}, a |-> 0, s |-> FALSE] @@  n2 :> [nif |-> n2, ts |-> {}, a |-> 0, s |-> FALSE] )
    public Entity(String name, Map<String, Record> elements) {
        this.records = elements;
        this.name = name;
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

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("    ").append(name).append(" = {\n");

        // To only print new line in between records
        int i = 0;
        int size = records.size();

        for (Entry<String, Record> e : records.entrySet()) {
            s.append("      ").append(e.getKey()).append(" = {\n").append(e.getValue().toString());
            if (++i < size)
                s.append("\n"); // newline only between records
        }

        s.append("\n    }");
        return s.toString();
    }
}
