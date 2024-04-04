package domain;


public class RequestState {

    private Request requestRecord;

    public RequestState(Request requestRecord) {
        this.requestRecord = requestRecord;
    }

    public Request getRequestRecord() {
        return requestRecord;
    }

    @Override
    public String toString() {
        return requestRecord.toString();
    }
}
