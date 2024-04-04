package domain;

public class Response {

    private Integer code;
    private Body body;

    public Response(Integer code, Body body) {
        this.code = code;
        this.body = body;
    }

    public Integer getCode() {
        return code;
    }

    public Body getBody() {
        return body;
    }

    @Override
    public String toString() {
        if (code != null)
            return "\n    code = " + code + "\n" + body.toString() + "\n";
        else
            return "\n    code = None\n" + body.toString()+ "\n";
    }
}
