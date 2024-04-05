import domain.State;
import org.junit.jupiter.api.Test;
import parser.VisitorOrientedParser;

public class ParserTest {

    @Test
    void test_single_state() {
        String stateStr = "/\\\\ f = FALSE" +
                "/\\\\ p = ( n1 :> [nif |-> n1, ts |-> {i1}, a |-> 0, s |-> TRUE] @@  n2 :> [nif |-> n2, ts |-> {}, a |-> 0, s |-> FALSE] )" +
                "/\\\\ t = ( i1 :> [s |-> TRUE, id |-> i1, ps |-> {n1}, c |-> 1] @@  i2 :> [s |-> FALSE, id |-> i2, ps |-> {}, c |-> 1] )" +
                "/\\\\ pc = TRUE" +
                "/\\\\ req = [ op |-> postEnrollment,  verb |-> post,  params |->      { [name |-> tournamentId, value |-> i1],        [name |-> playerNIF, value |-> n1] },  body |-> {} ]" +
                "/\\\\ res = [ body |->      { [ type |-> object,          int |-> 0,          bool |-> FALSE,          obj |-> {[player |-> n1, tournament |-> i1]} ] },  code |-> 200 ]";

        VisitorOrientedParser parser = new VisitorOrientedParser();
        State state = parser.parse(stateStr);
        System.out.println(state);
    }
}
