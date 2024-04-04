package domain;

import java.util.List;

public class Record {

    private List<RecordElement> elems;

    public Record(List<RecordElement> elems) {
        this.elems = elems;
    }

    public List<RecordElement> getElems() {
        return elems;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        for(RecordElement e : elems)
            s.append(e.toString() + "\n");

        s.deleteCharAt(s.length()-1);

        return s.toString();
    }
}
