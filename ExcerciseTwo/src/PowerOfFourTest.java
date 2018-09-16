import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFourTest {
    PowerOfFour powerOfFour;
    @Before
    public void setUp() throws Exception {
        powerOfFour = new PowerOfFour();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkForPowerOfFour(){
        // arrange
        boolean expected = true;
        // act
        boolean result = powerOfFour.isPowerOfFour(1);
        // assert
        assertEquals(expected,result);

        // arrange
        expected = false;
        // act
        result = powerOfFour.isPowerOfFour(0);
        // assert
        assertEquals(expected,result);

    }

}