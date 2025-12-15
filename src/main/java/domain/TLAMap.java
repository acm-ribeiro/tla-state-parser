package domain;

import java.util.List;

public class TLAMap {

    private List<MapElement> elems;

    public TLAMap(List<MapElement> elems) {
        this.elems = elems;
    }

    public List<MapElement> getElems() {
        return elems;
    }

    public int getNumElements() {
        return elems.size();
    }

    public boolean isEmpty() {
        return elems.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        for (MapElement elem : elems) {
            sb.append(elem.toString());
        }
        return sb.toString();
    }
}
