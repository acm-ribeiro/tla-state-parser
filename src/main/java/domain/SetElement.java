package domain;

import java.util.List;

public class SetElement {
    private List<String> strElems;
    private List<Integer> intElems;
    private List<Record> recordElems;

    public SetElement(List<String> strElems, List<Integer> intElems, List<Record> recordElems) {
        this.strElems = strElems;
        this.intElems = intElems;
        this.recordElems = recordElems;
    }

    public List<String> getStrElems() {
        return strElems;
    }

    public List<Integer> getIntElems() {
        return intElems;
    }

    public List<Record> getRecordElems() {
        return recordElems;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        if(!strElems.isEmpty())
            for(String str : strElems)
                s.append(str + ",");
        else if (!intElems.isEmpty())
            for(Integer i : intElems)
                s.append( i.toString() + ",");
        else if(!recordElems.isEmpty())
            for(Record r: recordElems)
                s.append(r.toString() + ",");

        if(!s.isEmpty()) {
            s.deleteCharAt(s.length()-1);
            return s.toString();
        } else
            return "";

    }

}
