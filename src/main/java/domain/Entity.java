package domain;

import java.util.ArrayList;

public class Entity {
    private final String name;
    private final TLAMap map;
    private final Set set;

    // p = ( n1 :> [nif |-> n1, ts |-> {}, a |-> 0, s |-> FALSE] @@  n2 :> [nif |-> n2, ts |-> {}, a |-> 0, s |-> FALSE] )
    public Entity(String name, TLAMap map, Set set, boolean emptyMap) {
        this.name = name;
        this.map = emptyMap? new TLAMap(new ArrayList<>()) : map;
        this.set = set;
    }

    public int getNumRecords() {
        return map.getNumElements();
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

        if (map != null && map.isEmpty()) {
            s.append("<<>>");
        } else if (map!= null) {
            s.append(map);
        } else if (set != null) {
            s.append(set);
        }
        return s.toString();
    }
}
