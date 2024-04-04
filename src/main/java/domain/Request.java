package domain;

import java.util.List;

public class Request {

    private String operationId, verb;
    private List<Parameter> parameters;
    private Body body;

    public Request (String operationId, String verb, List<Parameter> parameters, Body body) {
        this.operationId = operationId;
        this.verb = verb;
        this.parameters = parameters;
        this.body = body;
    }

    public String getOperationId() {
        return operationId;
    }

    public String getVerb() {
        return verb;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public Body getBody() {
        return body;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("request = {\n");
        s.append("    operation id = " + operationId + "\n");
        s.append("    verb = " + verb + "\n");
        s.append("    params = {");

        if(!parameters.isEmpty()) {
            s.append("\n");
            for (Parameter p : parameters)
                s.append("      " + p.toString() + "\n");
            s.append("    }\n");
        } else
            s.append("}\n");

        s.append(body);
        s.append("\n  }");

        return s.toString();
    }
}
