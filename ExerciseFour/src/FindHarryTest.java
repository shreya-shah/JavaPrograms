import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindHarryTest {
    FindHarry findHarry;
    @Before
    public void setUp() throws Exception {
        findHarry = new FindHarry();
    }

    @After
    public void tearDown() throws Exception {
        findHarry = null;
    }

    @Test
    public void searchForHarry(){
        boolean expected = true;
        boolean result = findHarry.isHarryHere("This is Harry.");
        assertEquals(expected,result);
    }

    @Test
    public void checkForNoHarry(){
        boolean expected = false;
        boolean result = findHarry.isHarryHere("This is Henry.");
        assertEquals(expected,result);
    }

}