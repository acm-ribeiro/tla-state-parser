package domain;

import java.util.List;

public class TagState {

    private List<String> tags;

    public TagState(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getTags() {
        return tags;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("    ");
        for (String tag : tags) {
            s.append(tag);
            s.append(", ");
        }

        if(!s.isEmpty())
            s.deleteCharAt(s.length() - 2);

        s.append("\n");

        return s.toString();
    }

}
