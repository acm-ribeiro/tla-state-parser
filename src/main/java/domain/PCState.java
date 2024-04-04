package domain;

public class PCState {

    private boolean pc;

    public PCState(boolean pc) {
        this.pc = pc;
    }

    public boolean getPC() {
        return pc;
    }

    @Override
    public String toString() {
        return pc? "pc = TRUE" : "pc = FALSE";
    }
}
