import static org.junit.Assert.*;
import org.junit.*;
public class AdditionClassTest {
    // think of test and import junit libraries
    @Test
    public void testAdd() {
        assertEquals(5, AdditionClass.add(1,4));
        // should run because 5 = 5 (1+4)
        // as expected, 1 failure. Time to push
        // run it on ssh server
        // another failure on ssh server, time to fix code
        // run it on ssh server
    }
}
