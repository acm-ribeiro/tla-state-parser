package domain;

import java.util.*;
import java.util.Map.Entry;

public class State {

    private String original;
    private List<StateElement> elements;

    public State (String original, List<StateElement> elements) {
        this.original = original;
        this.elements = elements;
    }

    public String getOriginal() {
        return original;
    }

    public List<StateElement> getElements() {
        return elements;
    }

    public Map<String, String> getSchemaMapping() {
        Map<String, String> mapping = new HashMap<>();
        Iterator<StateElement> it = elements.iterator();

        StateElement elem;
        SchemaMapping s = null;
        while (s == null && it.hasNext()) {
            elem = it.next();
            s = elem.getSchemaMapping();
        }

        Record r = s.getRecord();
        Map<String, RecordFieldValue> recordElems = r.getElems();

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
        Entity e = null;
        Iterator<StateElement> it = elements.iterator();

        StateElement elem;
        Map<String, Entity> entities;
        while(it.hasNext()) {
            elem = it.next();
            entities = elem.getEntities();

            if (entities != null && !entities.isEmpty())
                e = entities.get(entityName);
        }

        return e.getNumRecords();
    }

    /**
     * Returns a list containing the IDs of the entities on a state.
     *
     * @return entities IDs.
     */
    public List<String> getEntitiesID() {
        List<String> ids = new ArrayList<>();
        Iterator<StateElement> it = elements.iterator();

        StateElement elem;
        Map<String, Entity> entities;
        while (ids.isEmpty() && it.hasNext()) {
            elem = it.next();
            entities = elem.getEntities();

            if (entities != null && !entities.isEmpty())
                ids.addAll(elem.getEntities().keySet());
        }

        return ids;
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
        Map<String, Entity> entities = null;
        Iterator<StateElement> it = elements.iterator();

        while (it.hasNext() && entities == null)
            entities = it.next().getEntities() ;

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
