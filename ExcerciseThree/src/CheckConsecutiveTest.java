import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckConsecutiveTest {
    CheckConsecutive checkConsecutive;
    @Before
    public void setUp() throws Exception {
        checkConsecutive = new CheckConsecutive();
    }

    @After
    public void tearDown() throws Exception {
        checkConsecutive = null;
    }

    @Test
    public void testConsecutive(){
        // arrange
        boolean expected = true;
        // act
        boolean result = checkConsecutive.isConsecutive("-1,-2,-3,-4,-5");
        // assert
        assertEquals(expected,result);
        // act
        result = checkConsecutive.isConsecutive("1, 2, 3,4");
        // assert
        assertEquals(expected,result);
    }

    @Test
    public void testNonConsecutive(){
        // arrange
        boolean expected = false;
        //act
        boolean result = checkConsecutive.isConsecutive("7,8,9,11,2");
        // assert
        assertEquals(expected,result);
    }
}