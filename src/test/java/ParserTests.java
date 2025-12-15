import org.junit.jupiter.api.Test;

import domain.State;
import parser.VisitorOrientedParser;

public class ParserTests {
    VisitorOrientedParser parser = new VisitorOrientedParser();

    @Test
    public void testParser() {
        String stateStr =
            "/\\\\ products = (p1 :> [features |-> {}, configurations |-> (c1 :> {})])/\\\\ f = FALSE";
        State state = parser.parse(stateStr);
        System.out.println(state);
    }
}
