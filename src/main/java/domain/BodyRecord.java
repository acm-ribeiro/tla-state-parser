package domain;

public class BodyRecord {

    private String type;
    private int num;
    private boolean bool;
    private ObjectRecord obj;

    public BodyRecord(String type, int num, boolean bool, ObjectRecord obj) {
        this.type = type;
        this.num = num;
        this.bool = bool;
        this.obj = obj;
    }

    public String getType() {
        return type;
    }

    public int getInt() {
        return num;
    }

    public boolean getBool() {
        return bool;
    }

    public ObjectRecord getObj() {
        return obj;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("      type: " + type + "\n");
        s.append("      int: " + num + "\n");
        s.append("      bool: " + bool + "\n");
        s.append("      obj: " + obj);
        return s.toString();
    }
}
