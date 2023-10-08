import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class StringManagerTest {
    @Test
    public void testApple() {
        String[] inString = {"Apples"};
        stringmanager sm = new stringmanager(inString);
        assertEquals(2, sm.homeManyOfThis('x'));
    }

    @Test
    public void testMultiple() {
        String[] inString = {"Apples", "Oranges"};
        stringmanager sm = new stringmanager(inString);
        assertEquals(2, sm.homeManyOfThis('e'));
    }
}
