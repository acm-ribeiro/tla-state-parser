package domain;

import java.util.ArrayList;

public class RecordFieldValue {

    private String str;
    private Integer num;
    private Boolean bool;
    private Set set;
    private TLAMap tlaMap;
    private boolean isEmpty;

    public RecordFieldValue(String str, Integer num, Boolean bool, Set set, TLAMap tlaMap, boolean isEmpty) {
        this.str = str;
        this.num = num;
        this.bool = bool;
        this.set = set;
        this.tlaMap = isEmpty ? new TLAMap(new ArrayList<>()) : tlaMap;
    }

    public String getStr() {
        return str;
    }

    public Integer getNum() {
        return num;
    }

    public Boolean getBool() {
        return bool;
    }

    public Set getSet() {
        return set;
    }

    public TLAMap getTlaMap() {
        return tlaMap;
    }


    @Override
    public String toString() {
        if (str != null)
            return str;
        else if (num != null)
            return num.toString();
        else if (bool != null)
            return bool.toString();
        else if (set != null)
            return set.toString();
        else if (tlaMap != null && tlaMap.isEmpty())
            return "<<>>";
        else
            return tlaMap.toString();
    }
}
