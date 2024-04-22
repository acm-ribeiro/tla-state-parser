import domain.Entity;
import domain.State;
import domain.StateElement;
import org.junit.jupiter.api.Test;
import parser.VisitorOrientedParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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

    @Test
    void test_initial_state_empty() {
        String init ="/\\\\ f = FALSE" +
                "/\\\\ p = ( n1 :> [nif |-> n1, ts |-> {}, a |-> 0, s |-> FALSE] @@  n2 :> [nif |-> n2, ts |-> {}, a |-> 0, s |-> FALSE] )" +
                "/\\\\ t = ( i1 :> [s |-> FALSE, id |-> i1, ps |-> {}, c |-> 1] @@  i2 :> [s |-> FALSE, id |-> i2, ps |-> {}, c |-> 1] )" +
                "/\\\\ pc = TRUE" +
                "/\\\\ req = [op |-> None, verb |-> None, params |-> {}, body |-> {}]" +
                "/\\\\ res = [body |-> {}, code |-> None]";

        VisitorOrientedParser parser = new VisitorOrientedParser();
        State state = parser.parse(init);
        List<Boolean> actual = new ArrayList<>();

        List<StateElement> elems = state.getElements();
        for(StateElement elem : elems) {
           Map<String, Entity> entities = elem.getEntities() != null? elem.getEntities() : null;
           if (entities != null)
               for (Entry<String, Entity> e : entities.entrySet())
                   actual.add(e.getValue().isEmpty());
        }

        assert(!actual.contains(false));

    }
    @Test
    void test_initial_state_not_empty() {
        String stateStr = "/\\\\ f = FALSE" +
                "/\\\\ p = ( n1 :> [nif |-> n1, ts |-> {}, a |-> 0, s |-> FALSE] @@  n2 :> [nif |-> n2, ts |-> {}, a |-> 0, s |-> FALSE] )" +
                "/\\\\ t = ( i1 :> [s |-> TRUE, id |-> i1, ps |-> {}, c |-> 1] @@  i2 :> [s |-> FALSE, id |-> i2, ps |-> {}, c |-> 1] )" +
                "/\\\\ pc = TRUE" +
                "/\\\\ req = [ op |-> postTournament,  verb |-> post,  params |-> {},  body |->      { [ type |-> object,          int |-> 0,          bool |-> FALSE,          obj |-> {[s |-> FALSE, id |-> i1, ps |-> {}, c |-> 1]} ] } ]" +
                "/\\\\ res = [ body |->      { [ type |-> object,          int |-> 0,          bool |-> FALSE,          obj |-> {[s |-> TRUE, id |-> i1, ps |-> {}, c |-> 1]} ] },  code |-> 201 ]";

        VisitorOrientedParser parser = new VisitorOrientedParser();
        State state = parser.parse(stateStr);
        List<Boolean> actual = new ArrayList<>();

        List<StateElement> elems = state.getElements();
        for(StateElement elem : elems) {
            Map<String, Entity> entities = elem.getEntities() != null? elem.getEntities() : null;
            if (entities != null)
                for (Entry<String, Entity> e : entities.entrySet())
                    actual.add(e.getValue().isEmpty());
        }

        assert(actual.get(0));  // is empty
        assert(!actual.get(1)); // is not empty


    }
}
