package domain;

import java.util.List;

public class ObjectRecord {

    private List<Record> records;
    private List<String> strRecords;
    private boolean empty;

    public ObjectRecord(List<Record> records, List<String> strRecords) {
        this.records = records;
        this.strRecords = strRecords;
        empty = records.isEmpty() && strRecords.isEmpty();
    }

    public List<Record> getRecords() {
        return records;
    }

    public List<String> getStrRecords() {
        return strRecords;
    }

    public boolean isEmpty() {
        return empty;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{");

        if(empty)
            s.append("}");
        else {
            s.append("\n");

            for (Record r : records)
                s.append(r.toString() + "\n");

            for(String str : strRecords)
                s.append(str + "\n");
        }

        return s.toString();
    }

}
