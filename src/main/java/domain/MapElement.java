package domain;

public class MapElement {
    private String key;

    private String strValue;

    private Record recordValue;

    private Set setValue;

    public MapElement(String key, String strValue, Record recordValue, Set setValue) {
        this.key = key;
        this.strValue = strValue;
        this.recordValue = recordValue;
        this.setValue = setValue;
    }

    public String getKey() {
        return key;
    }

    public String getStrValue() {
        return strValue;
    }

    public Record getRecordValue() {
        return recordValue;
    }

    public Set getSetValue() {
        return setValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(key + ":\n      ");

        if (strValue != null) {
            sb.append(strValue);
        } else if (recordValue != null) {
            sb.append(recordValue.toString());
        } else if (setValue != null) {
            sb.append(setValue.toString());
        }

        return sb.toString();
    }
}
