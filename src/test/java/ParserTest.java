import domain.Entity;
import domain.Record;
import domain.State;
import domain.StateElement;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import parser.VisitorOrientedParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ParserTest {

    @Test
    void test_final_state_t() {
        String stateStr =
                "/\\\\ f = TRUE" +
                "/\\\\ pc = TRUE" +
                "/\\\\ req = [ op |-> deletePlayer,  verb |-> delete,  params |-> {[name |-> pid, value |-> p1]},  body |-> [type |-> None, int |-> 0, bool |-> FALSE, obj |-> {}] ]" +
                "/\\\\ res = [ body |-> [ type |-> object, int |-> 0, bool |-> FALSE,  obj |-> {[pid |-> p1, s |-> FALSE, ts |-> {}]} ],  code |-> 200 ]" +
                "/\\\\ tournaments = ( t1 :> [tid |-> t1, s |-> FALSE, ps |-> {}, c |-> 1] @@  t2 :> [tid |-> t2, s |-> FALSE, ps |-> {}, c |-> 1] )" +
                "/\\\\ schemaMapping = [ tournaments |-> Tournament,  players |-> Player,  enrollments |-> Enrollment ]" +
                "/\\\\ players = ( p1 :> [pid |-> p1, s |-> FALSE, ts |-> {}] @@  p2 :> [pid |-> p2, s |-> FALSE, ts |-> {}] )" +
                "/\\\\ enrollments = ( e1 :> [eid |-> e1, pid |-> p1, tid |-> t1, s |-> FALSE] @@  e2 :> [eid |-> e2, pid |-> p1, tid |-> t1, s |-> FALSE] )" +
                "/\\\\ tags = {tournaments, players, enrollments}";
        VisitorOrientedParser parser = new VisitorOrientedParser();
        State state = parser.parse(stateStr);
        assert(state.isFinalState());
    }

    @Test
    void test_final_state_f() {
        String stateStr =
                "/\\\\ f = FALSE" +
                "/\\\\ pc = TRUE" +
                "/\\\\ req = [ op |-> None,  verb |-> None,  params |-> {},  body |-> [type |-> None, int |-> 0, bool |-> FALSE, obj |-> {}] ]" +
                "/\\\\ res = [ body |-> [type |-> None, int |-> 0, bool |-> FALSE, obj |-> {}],  code |-> None ]" +
                "/\\\\ tournaments = (t1 :> [tid |-> t1, s |-> FALSE, ps |-> {}, c |-> 1])" +
                "/\\\\ schemaMapping = [ tournaments |-> Tournament,  players |-> Player,  enrollments |-> Enrollment ]" +
                "/\\\\ players = (p1 :> [pid |-> p1, s |-> FALSE, ts |-> {}])" +
                "/\\\\ enrollments = (e1 :> [eid |-> e1, pid |-> p1, tid |-> t1, s |-> FALSE])" +
                "/\\\\ tags = {None}";
        VisitorOrientedParser parser = new VisitorOrientedParser();
        State state = parser.parse(stateStr);
        assert(!state.isFinalState());
    }

    @Test
    void test_tagsEmpty() {
        String stateStr =
                "/\\\\ f = FALSE" +
                "/\\\\ pc = TRUE" +
                "/\\\\ req = [ op |-> None,  verb |-> None,  params |-> {},  body |-> [type |-> None, int |-> 0, bool |-> FALSE, obj |-> {}] ]" +
                "/\\\\ res = [ body |-> [type |-> None, int |-> 0, bool |-> FALSE, obj |-> {}],  code |-> None ]" +
                "/\\\\ tournaments = (t1 :> [tid |-> t1, s |-> FALSE, ps |-> {}, c |-> 1])" +
                "/\\\\ schemaMapping = [ tournaments |-> Tournament,  players |-> Player,  enrollments |-> Enrollment ]" +
                "/\\\\ players = (p1 :> [pid |-> p1, s |-> FALSE, ts |-> {}])" +
                "/\\\\ enrollments = (e1 :> [eid |-> e1, pid |-> p1, tid |-> t1, s |-> FALSE])" +
                "/\\\\ tags = {None}";
        VisitorOrientedParser parser = new VisitorOrientedParser();
        State state = parser.parse(stateStr);

        List<String> tags = state.getTags();
        assert (tags.isEmpty());
    }

    @Test
    void test_tags() {
        String stateStr = "/\\\\ f = TRUE" +
                "/\\\\ pc = TRUE" +
                "/\\\\ req = [ op |-> deleteTournament, verb |-> delete,  params |-> {[name |-> tid, value |-> t1]},  body |-> [type |-> None, int |-> 0, bool |-> FALSE, obj |-> {}] ]" +
                "/\\\\ res = [ body |-> [ type |-> object, int |-> 0, bool |-> FALSE, obj |-> {[tid |-> t1, s |-> FALSE, ps |-> {}, c |-> 1]} ],  code |-> 200 ]" +
                "/\\\\ tournaments = ( t1 :> [tid |-> t1, s |-> FALSE, ps |-> {}, c |-> 1] @@  t2 :> [tid |-> t2, s |-> FALSE, ps |-> {}, c |-> 1] )" +
                "/\\\\ schemaMapping = [ tournaments |-> Tournament,  players |-> Player,  enrollments |-> Enrollment ]" +
                "/\\\\ players = ( p1 :> [pid |-> p1, s |-> FALSE, ts |-> {}] @@  p2 :> [pid |-> p2, s |-> FALSE, ts |-> {}] )" +
                "/\\\\ enrollments = ( e1 :> [eid |-> e1, pid |-> p1, tid |-> t1, s |-> FALSE] @@  e2 :> [eid |-> e2, pid |-> p1, tid |-> t1, s |-> FALSE] )" +
                "/\\\\ tags = {tournaments, players}";
        VisitorOrientedParser parser = new VisitorOrientedParser();
        State state = parser.parse(stateStr);

        List<String> tags = state.getTags();
        assert (tags.contains("players"));
        assert (tags.contains("tournaments"));
    }

    @Test
    void test_getTransitionLabel() {
        String stateStr = "/\\\\ f = TRUE" +
                "/\\\\ pc = TRUE" +
                "/\\\\ req = [ op |-> deletePlayer,  verb |-> delete,  params |-> {[name |-> pid, value |-> p1]},  body |-> [type |-> None, int |-> 0, bool |-> FALSE, obj |-> {}] ]" +
                "/\\\\ res = [ body |-> [ type |-> object, int |-> 0, bool |-> FALSE,  obj |-> {[pid |-> p1, s |-> FALSE, ts |-> {}]} ],  code |-> 200 ]" +
                "/\\\\ tournaments = ( t1 :> [tid |-> t1, s |-> FALSE, ps |-> {}, c |-> 1] @@  t2 :> [tid |-> t2, s |-> FALSE, ps |-> {}, c |-> 1] )" +
                "/\\\\ schemaMapping = [ tournaments |-> Tournament,  players |-> Player,  enrollments |-> Enrollment ]" +
                "/\\\\ players = ( p1 :> [pid |-> p1, s |-> FALSE, ts |-> {}] @@  p2 :> [pid |-> p2, s |-> FALSE, ts |-> {}] )" +
                "/\\\\ enrollments = ( e1 :> [eid |-> e1, pid |-> p1, tid |-> t1, s |-> FALSE] @@  e2 :> [eid |-> e2, pid |-> p1, tid |-> t1, s |-> FALSE] )" +
                "/\\\\ tags = {tournaments, players, enrollments}";
        VisitorOrientedParser parser = new VisitorOrientedParser();
        State state = parser.parse(stateStr);

        String label = state.getTransitionLabel();
        assert(label.equals("deletePlayer"));
    }

    @Test
    void test_getEntitiesIDs() {
        String stateStr = "/\\\\ f = FALSE" +
                "/\\\\ pc = TRUE" +
                "/\\\\ req = [ op |-> None,  verb |-> None,  params |-> {},  body |-> [type |-> None, int |-> 0, bool |-> FALSE, obj |-> {}] ]" +
                "/\\\\ res = [ body |-> [type |-> None, int |-> 0, bool |-> FALSE, obj |-> {}],  code |-> None ]" +
                "/\\\\ tournaments = (t1 :> [tid |-> t1, s |-> FALSE, ps |-> {}, c |-> 1])" +
                "/\\\\ schemaMapping = [ tournaments |-> Tournament,  players |-> Player,  enrollments |-> Enrollment ]" +
                "/\\\\ players = (p1 :> [pid |-> p1, s |-> FALSE, ts |-> {}])" +
                "/\\\\ enrollments = (e1 :> [eid |-> e1, pid |-> p1, tid |-> t1, s |-> FALSE])" +
                "/\\\\ tags = {None}";
        VisitorOrientedParser parser = new VisitorOrientedParser();
        State state = parser.parse(stateStr);

        List<String> ids = state.getEntitiesID();

        System.out.println(ids);
        assert (ids.size() == 3);
        assert (ids.contains("players"));
        assert (ids.contains("tournaments"));
        assert (ids.contains("enrollments"));
    }

    @Test
    void test_schemaMapping() {
        String stateStr =
                "/\\\\ f = FALSE" +
                "/\\\\ pc = TRUE" +
                "/\\\\ req = [ op |-> None,  verb |-> None,  params |-> {},  body |-> [type |-> None, int |-> 0, bool |-> FALSE, obj |-> {}] ]" +
                "/\\\\ res = [ body |-> [type |-> None, int |-> 0, bool |-> FALSE, obj |-> {}],  code |-> None ]" +
                "/\\\\ tournaments = (t1 :> [tid |-> t1, s |-> FALSE, ps |-> {}, c |-> 1])" +
                "/\\\\ schemaMapping = [ tournaments |-> Tournament,  players |-> Player,  enrollments |-> Enrollment ]" +
                "/\\\\ players = (p1 :> [pid |-> p1, s |-> FALSE, ts |-> {}])" +
                "/\\\\ enrollments = (e1 :> [eid |-> e1, pid |-> p1, tid |-> t1, s |-> FALSE])" +
                "/\\\\ tags = {None}";
        VisitorOrientedParser parser = new VisitorOrientedParser();
        State state = parser.parse(stateStr);

        Map<String, String> mapping = state.getSchemaMapping();
        assert (mapping.get("tournaments").equals("Tournament"));
        assert (mapping.get("enrollments").equals("Enrollment"));
        assert (mapping.get("players").equals("Player"));
    }

    @Test
    void test_getEntity() {
        // initial state of the complete graph
        String stateStr = "/\\\\ f = FALSE" +
                "/\\\\ pc = TRUE" +
                "/\\\\ req = [ op |-> None,  verb |-> None,  params |-> {},  body |-> [type |-> None, int |-> 0, bool |-> FALSE, obj |-> {}] ]" +
                "/\\\\ res = [ body |-> [type |-> None, int |-> 0, bool |-> FALSE, obj |-> {}],  code |-> None ]" +
                "/\\\\ tournaments = ( t1 :> [tid |-> t1, s |-> FALSE, ps |-> {}, c |-> 1] @@  t2 :> [tid |-> t2, s |-> FALSE, ps |-> {}, c |-> 1] )" +
                "/\\\\ schemaMapping = [ tournaments |-> Tournament,  players |-> Player,  enrollments |-> Enrollment ]" +
                "/\\\\ players = ( p1 :> [pid |-> p1, s |-> FALSE, ts |-> {}] @@  p2 :> [pid |-> p2, s |-> FALSE, ts |-> {}] )" +
                "/\\\\ enrollments = ( e1 :> [eid |-> e1, pid |-> p1, tid |-> t1, s |-> FALSE] @@  e2 :> [eid |-> e2, pid |-> p1, tid |-> t1, s |-> FALSE] )" +
                "/\\\\ tags = {None}";
        VisitorOrientedParser parser = new VisitorOrientedParser();
        State state = parser.parse(stateStr);

        assert (state.getNumRecords("players") == 2);
        assert (state.getNumRecords("tournaments") == 2);
        assert (state.getNumRecords("enrollments") == 2);
    }

    @Test
    void test_getRecordById() {
        String stateStr =
                "/\\\\ f = FALSE" +
                "/\\\\ pc = TRUE" +
                "/\\\\ req = [ op |-> None,  verb |-> None,  params |-> {},  body |-> [type |-> None, int |-> 0, bool |-> FALSE, obj |-> {}] ]" +
                "/\\\\ res = [ body |-> [type |-> None, int |-> 0, bool |-> FALSE, obj |-> {}],  code |-> None ]" +
                "/\\\\ tournaments = ( t1 :> [tid |-> t1, s |-> FALSE, ps |-> {}, c |-> 1] @@  t2 :> [tid |-> t2, s |-> FALSE, ps |-> {}, c |-> 1] )" +
                "/\\\\ schemaMapping = [ tournaments |-> Tournament,  players |-> Player,  enrollments |-> Enrollment ]" +
                "/\\\\ players = ( p1 :> [pid |-> p1, s |-> FALSE, ts |-> {}] @@  p2 :> [pid |-> p2, s |-> FALSE, ts |-> {}] )" +
                "/\\\\ enrollments = ( e1 :> [eid |-> e1, pid |-> p1, tid |-> t1, s |-> FALSE] @@  e2 :> [eid |-> e2, pid |-> p1, tid |-> t1, s |-> FALSE] )" +
                "/\\\\ tags = {None}";

        VisitorOrientedParser parser = new VisitorOrientedParser();
        State state = parser.parse(stateStr);

        Map<String, Entity> entities = state.getEntities();

        // Entities
        Entity players = entities.get("players");
        Entity tournaments = entities.get("tournaments");
        Entity enrollments = entities.get("enrollments");

        // Records
        Record p1 = players.getRecordById("p1");
        Record p2 = players.getRecordById("p2");
        Record t1 = tournaments.getRecordById("t1");
        Record t2 = tournaments.getRecordById("t2");
        Record e1 = enrollments.getRecordById("e1");
        Record e2 = enrollments.getRecordById("e2");

        assert (p1 != null);
        assert (p2 != null);
        assert (t1 != null);
        assert (t2 != null);
        assert (e1 != null);
        assert (e2 != null);
    }
}
