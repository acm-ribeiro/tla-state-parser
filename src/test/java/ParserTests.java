import org.junit.jupiter.api.Test;

import domain.State;
import parser.VisitorOrientedParser;

public class ParserTests {

    VisitorOrientedParser parser = new VisitorOrientedParser();

    @Test
    public void testParser() {
        String stateStr = "/\\ f = FALSE"
            + "/\\ tournaments = (t1 :> [ps |-> {}, c |-> 1] @@ t2 :> [ps |-> {p1}, c |-> 1])"
            + "/\\ players = (p1 :> [ts |-> {t2}])"
            + "/\\ enrollments = (e1 :> [pid |-> p1, tid |-> t2])";
        State state = parser.parse(stateStr);
        System.out.println(state.toString());
    }


}
