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

            s.append("{");
            for(SetElement e : elems)
                s.append(e.toString() + ", ");

            s.deleteCharAt(s.length()-1);
            s.deleteCharAt(s.length()-1);
            s.append("}");

            return s.toString();
        }
    }
}
