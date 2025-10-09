package domain;

import java.util.Map;

public class StateElement {
    private final FState f;

    private final Map<String, Entity> entities;

    public StateElement(FState fState, Map<String, Entity> entities) {
        f = fState;
        this.entities = entities;
    }

    /**
     * Returns the final state.
     *
     * @return final state
     */
    public FState getF() {
        return f;
    }

    /**
     * Checks whether this state element is an entity.
     *
     * @return true if the element is an entity; false otherwise.
     */
    public boolean isEntity() {
        return entities != null && !entities.isEmpty();
    }

    /**
     * Returns the number of records within the given entity. E.g. p = (p1 :> [...], p2 :> [...]) will return 2.
     *
     * @return number of records.
     */
    public int getNumRecords(String entityName) {
        return entities.get(entityName).getNumRecords();
    }

    public Map<String, Entity> getEntities() {
        return entities;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        if (f != null) {
            s.append(f);
        }

        if (entities != null) {
            s.append("entities = {\n");

            for (Map.Entry<String, Entity> e : entities.entrySet()) {
                s.append(e.getValue().toString());
                s.append("\n");
            }

            s.append("  }");
        }

        return s.toString();
    }
}
