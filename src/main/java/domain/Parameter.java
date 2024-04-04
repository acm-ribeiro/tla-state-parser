package domain;

public class Parameter {

    private String name, value;

    public Parameter(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "[name: " + name + ", " + "value: " + value + "]";
    }

}
