import static org.junit.Assert.*;
import org.junit.*;
public class AdditionClassTest {
    // think of test and import junit libraries
    @Test
    public void testAdd() {
        assertEquals(5, AdditionClass.add(1,3));
        // should fail because 5 doesn't equal 4
    }
}
