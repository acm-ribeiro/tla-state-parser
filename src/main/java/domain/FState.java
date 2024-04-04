package domain;

public class FState {

    private boolean f;

    public FState(boolean f) {
        this.f = f;
    }

    public boolean getF(){
        return f;
    }

    @Override
    public String toString() {
        return f? "f = TRUE" : "f = FALSE";
    }
}
