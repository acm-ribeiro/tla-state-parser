package domain;

import java.util.List;

public class Body {

    private List<BodyRecord> bodyRecords;

    public Body(List<BodyRecord> bodyRecords) {
        this.bodyRecords = bodyRecords;
    }

    public List<BodyRecord> getBodyRecord() {
        return bodyRecords;
    }

    @Override
    public String toString() {
        if(bodyRecords.isEmpty())
            return "    body = {}";
        else {
            StringBuilder s = new StringBuilder();
            s.append("    body = {\n");

            for (BodyRecord b : bodyRecords)
                s.append(b.toString() + "\n");

            s.deleteCharAt(s.length() - 1);
            s.append("    }");

            return s.toString();
        }
    }
}
