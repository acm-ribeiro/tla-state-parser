package domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class State {

    private final String original;
    private final List<StateElement> elements;
    private Map<String, Entity> entities;
    private boolean found;

    public State(String original, List<StateElement> elements) {
        this.original = original;
        this.elements = elements;

        entities = new HashMap<>();
        for (StateElement elem : elements) {
            if (elem.isEntity()) {
                entities.putAll(elem.getEntities());
            }
        }

        found = false;
    }

    /**
     * Checks whether this state has been found.
     * Used on SSG for coverage computation purposes.
     *
     * @return found
     */
    public boolean isFound() {
        return found;
    }

    /**
     * Marks this state as found.
     * Used on SSG for coverage computation purposes.
     */
    public void markFound() {
        found = true;
    }

    /**
     * Returns the original string, before parsing.
     *
     * @return original state string representation.
     */
    public String getOriginal() {
        return original;
    }

    /**
     * Returns the state's elements.
     *
     * @return state elements.
     */
    public List<StateElement> getElements() {
        return elements;
    }

    /**
     * Returns a map of this state's entities. An entity is a set of records, e.g. p = {p1 :> [...], p2:> [...]} key: p
     * value: the set of records
     *
     * @return entities map
     */
    public Map<String, Entity> getEntities() {
        return entities;
    }

    /**
     * Checks whether this state is a final state. *
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

        for (StateElement e : elements) {
            s.append("  ");
            s.append(e.toString());
            s.append("\n");
        }
        s.append("}");

        return s.toString();
    }
}
