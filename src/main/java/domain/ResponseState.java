package domain;

public class ResponseState {

    private Response responseRecord;

    public ResponseState(Response responseRecord) {
        this.responseRecord = responseRecord;
    }

    public Response getResponseRecord() {
        return responseRecord;
    }

    @Override
    public String toString() {
        return "res = {" + responseRecord.toString() + "  }";
    }
}
