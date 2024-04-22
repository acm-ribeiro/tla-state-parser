package domain;

public class RecordFieldValue {

    private String str;
    private Integer num;
    private Boolean bool;
    private Set set;

    public RecordFieldValue(String str, Integer num, Boolean bool, Set set) {
        this.str = str;
        this.num = num;
        this.bool = bool;
        this.set = set;
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


    @Override
    public String toString() {
        if(str != null)
            return str;
        else if(num != null)
            return num.toString();
        else if (bool != null)
            return bool.toString();
        else
            return set.toString();
    }
}
