package domain;

import java.util.Map;

public class StateElement {

    private final FState f;
    private final PCState pc;
    private final RequestState req;
    private final ResponseState res;
    private final Map<String, Entity> entities;
    private final TagState tagState;
    private final SchemaMapping schemaMapping;

    public StateElement(FState fState, PCState pcState, RequestState requestState, ResponseState resState,
                        Map<String, Entity> entities, TagState tagState, SchemaMapping schemaMapping) {
        f = fState;
        pc = pcState;
        req = requestState;
        res = resState;
        this.entities = entities;
        this.tagState = tagState;
        this.schemaMapping = schemaMapping;
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
     * Returns the number of records within the given entity.
     * E.g. p = (p1 :> [...], p2 :> [...]) will return 2.
     *
     * @return number of records.
     */
    public int getNumRecords(String entityName) {
        return entities.get(entityName).getNumRecords();
    }

    public FState getF() {
        return f;
    }

    public PCState getPc() {
        return pc;
    }

    public RequestState getReq() {
        return req;
    }

    public ResponseState getRes() {
        return res;
    }

    public Map<String, Entity> getEntities() {
        return entities;
    }

    public TagState getTagState () {
        return tagState;
    }


    public SchemaMapping getSchemaMapping() {
        return schemaMapping;
    }


    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        if (f != null)
            s.append(f);
        else if (pc != null)
            s.append(pc);
        else if (req != null)
            s.append(req);
        else if (res != null)
            s.append(res);
        else if (entities != null)
            if (entities.isEmpty())
                s.append("entities = {}");
            else {
                s.append("entities = {\n");

                for (Map.Entry<String, Entity> e : entities.entrySet()){
                    s.append(e.getValue().toString());
                    s.append("\n");
                }

                s.append("  }");
            }
        else if (tagState != null)
            if (tagState.getTags().isEmpty())
                s.append("tags = {}\n");
            else {
                s.append("tags = {\n");
                s.append(tagState);
                s.append("  }");
            }
        else if (schemaMapping != null)
            s.append(schemaMapping);

        return s.toString();
    }


}
