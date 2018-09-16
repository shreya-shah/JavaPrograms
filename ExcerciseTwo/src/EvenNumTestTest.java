import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testForEvenNumber(){
        //arrange
        boolean expected = true;
        //act
        boolean result = EvenNumTest.isEven(6);
        //assert
        assertEquals(expected,result);
    }

    @Test
    public void testForOddNumber(){
        //arrange
        boolean expected = false;
        //act
        boolean result = EvenNumTest.isEven(3);
        //assert
        assertEquals(expected,result);
    }

    @Test
    public void testForZero(){
        //arrange
        boolean expected = false;
        //act
        boolean result = EvenNumTest.isEven(0);
        //assert
        assertEquals(expected,result);
    }
}