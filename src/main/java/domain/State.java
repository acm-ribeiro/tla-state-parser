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

    /**
     * Checks whether this state is a final state.
     *
     * @return true if it is a final state; false otherwise.
     */
    public boolean isFinalState() {
        boolean isFinalState = false;

        for (StateElement e : elements)
            if (e.getF() != null)
                isFinalState = e.getF().getF();

        return isFinalState;
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
