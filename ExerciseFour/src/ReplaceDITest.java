import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceDITest {
    ReplaceDI replaceDI;
    @Before
    public void setUp() throws Exception {
        replaceDI = new ReplaceDI();
    }

    @After
    public void tearDown() throws Exception {
        replaceDI = null;
    }

    @Test
    public void testReplacement(){
        String expected = "faity fry";
        String result = replaceDI.getReplacedString("daily dry");
        assertEquals(expected,result);
    }

}