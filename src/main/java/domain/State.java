package domain;

import java.util.*;
import java.util.Map.Entry;

public class State {

    private final String original;
    private final List<StateElement> elements;
    private Map<String, Entity> entities;

    public State (String original, List<StateElement> elements) {
        this.original = original;
        this.elements = elements;

        entities = new HashMap<>();
        for (StateElement elem : elements)
            if (elem.isEntity())
                entities.putAll(elem.getEntities());
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
     * Returns the tags list.
     *
     * @return tag list.
     */
    public List<String> getTags() {
        List<String> tags = null;
        Iterator<StateElement> it = elements.iterator();

        while (it.hasNext() && tags == null){
            StateElement elem = it.next();
            tags = elem.getTagState() != null? elem.getTagState().getTags() : null;
        }

        return tags;
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
     * Returns the schema mapping to entities.
     *
     * @return schema mapping.
     */
    public Map<String, String> getSchemaMapping() {
        Map<String, String> mapping = new HashMap<>();
        Iterator<StateElement> it = elements.iterator();

        StateElement elem;
        SchemaMapping s = null;
        while (s == null && it.hasNext()) {
            elem = it.next();
            s = elem.getSchemaMapping();
        }

        Record r = s != null? s.getRecord() : null;
        Map<String, RecordFieldValue> recordElems = r != null? r.getElems() : null;

        if (recordElems != null)
            for (Entry<String, RecordFieldValue> e : recordElems.entrySet())
                mapping.put(e.getKey(), e.getValue().toString());

        return mapping;
    }

    /**
     * Returns the number of records of the given entity.
     * @param entityName entity name (e.g. "p" or "t")
     *
     * @return number of records of the entity.
     */
    public int getNumRecords(String entityName) {
        Entity e = entities.get(entityName);
        return e != null? e.getNumRecords() : -1;
    }

    /**
     * Returns a list containing the IDs of the entities on a state.
     *
     * @return entities IDs.
     */
    public List<String> getEntitiesID() {
        return entities.keySet().stream().toList();
    }

    /**
     * Returns a map of this state's entities.
     * An entity is a set of records, e.g. p = {p1 :> [...], p2:> [...]}
     * key: p
     * value: the set of records
     *
     * @return entities map
     */
    public Map<String, Entity> getEntities() {
        return entities;
    }

    /**
     * Returns the state's transition label.
     *
     * @return transition label.
     */
    public String getTransitionLabel() {
        String label = null;
        Iterator<StateElement> it = elements.iterator();

        StateElement elem;
        while (label == null && it.hasNext()) {
            elem = it.next();

            if (elem.getReq() != null)
                label = elem.getReq().getRequestRecord().getOperationId();
        }

        return label;
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

        for (StateElement e : elements){
            s.append("  ");
            s.append(e.toString());
            s.append("\n");
        }
        s.append("}");

        return s.toString();
    }
}
