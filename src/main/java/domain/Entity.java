package domain;

import java.util.Map;
import java.util.Map.Entry;

public class Entity {

    private String name;
    private Map<String, Record> records;

    public Entity (String name, Map<String, Record> elements) {
        this.records = elements;
        this.name = name;
    }

    public Map<String, Record>  getRecords () {
        return records;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        for (Entry<String, Record> e: records.entrySet())
            s.append("    " + e.getKey() + " = {\n" + e.getValue().toString());

        s.append("\n    }");
        return s.toString();
    }

}
