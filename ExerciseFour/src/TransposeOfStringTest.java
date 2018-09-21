import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeOfStringTest {
    TransposeOfString transposeOfString;
    @Before
    public void setUp() throws Exception {
        transposeOfString = new TransposeOfString();
    }

    @After
    public void tearDown() throws Exception {
        transposeOfString = null;
    }

    @Test
    public void checkIfTranspose(){
        String expected = "a kciuq nworb xof spmuj revo eht yzal god";
        String result = transposeOfString.getTranspose("a quick brown fox jumps over the lazy dog");
        assertEquals(expected,result);
    }
}