package domain;

import java.util.List;

public class Set {

    private List<SetElement> elems;

    public Set(List<SetElement> elems) {
        this.elems = elems;
    }

    public List<SetElement> getElems() {
        return elems;
    }

    @Override
    public String toString() {
        if(elems.isEmpty())
            return "{}";
        else {
            StringBuilder s = new StringBuilder();

            s.append("{\n");
            for(SetElement e : elems)
                s.append(e.toString() + "\n");
            s.append("}");

            return s.toString();
        }
    }
}
