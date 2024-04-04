package domain;

public class RecordElement {

    private String name;
    private RecordFieldValue value;

    public RecordElement(String name, RecordFieldValue value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public RecordFieldValue getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "        " + name + " = " + value.toString();
    }
}
