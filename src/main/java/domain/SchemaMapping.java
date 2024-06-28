package domain;


public class SchemaMapping {

    private Record record;

    public SchemaMapping(Record record) {
        this.record = record;
    }

    @Override
    public String toString() {
        return record.toString();
    }
}
