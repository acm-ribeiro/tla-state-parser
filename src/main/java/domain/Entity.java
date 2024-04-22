package domain;

import org.stringtemplate.v4.ST;

import java.util.Iterator;
import java.util.Set;
import java.util.Map;
import java.util.Map.Entry;

public class Entity {

    private static final String STATUS_ELEMENT = "s";
    private String name;
    private Map<String, Record> records;

    // p = ( n1 :> [nif |-> n1, ts |-> {}, a |-> 0, s |-> FALSE] @@  n2 :> [nif |-> n2, ts |-> {}, a |-> 0, s |-> FALSE] )
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

    /**
     * Checks whether this entity is empty. An entity is empty when all its records have the STATUS_ELEMENT field
     * set to false.
     *
     * @return true if all records within this entity have the status false; false otherwise.
     */
    public boolean isEmpty() {
        int count = 0;
        Record r;
        Iterator<Entry<String, Record>> it = records.entrySet().iterator();

        while(count < records.size() && it.hasNext()) {
            r = it.next().getValue();
            if (r.getElement(STATUS_ELEMENT) != null && !r.getElement(STATUS_ELEMENT).getBool())
                count++;
        }

        return count == records.size();
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("    " + name + " = {\n");

        for (Entry<String, Record> e: records.entrySet())
            s.append("      " + e.getKey() + " = {\n" + e.getValue().toString());

        s.append("\n    }");
        return s.toString();
    }

}
