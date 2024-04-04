package domain;

import java.util.List;

public class State {

    private List<StateElement> elements;

    public State (List<StateElement> elements) {
        this.elements = elements;
    }

    public List<StateElement> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("state = {\n");

        for (StateElement e : elements)
            s.append("  " + e.toString() + "\n");

        s.append("}");

        return s.toString();
    }
}
