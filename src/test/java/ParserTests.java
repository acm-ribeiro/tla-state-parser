import org.junit.jupiter.api.Test;

import domain.State;
import parser.VisitorOrientedParser;

public class ParserTests {
    VisitorOrientedParser parser = new VisitorOrientedParser();

    @Test
    public void testParser() {
        String stateStr =
            "/\\ users = {u1, u2} /\\ f = TRUE /\\ orders = (o1 :> p2 @@ o2 :> p2) /\\ pets = {p1, " + "p2}";
        State state = parser.parse(stateStr);
        System.out.println(state.toString());
    }
}
