import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class MoreThanTwoOccurencesTest {
    MoreThanTwoOccurences moreThanTwoOccurences;
    @Before
    public void setUp() throws Exception {
        moreThanTwoOccurences = new MoreThanTwoOccurences();
    }

    @After
    public void tearDown() throws Exception {
        moreThanTwoOccurences = null;
    }

    @Test
    public void checkForOccurences() {
        HashMap<String,Boolean> expected = new HashMap<String, Boolean>();
        expected.put("a",true);
        expected.put("b",false);
        expected.put("c",true);
        expected.put("d",false);

        String arr[] = {"a","b","c","d","a","c","c"};

        HashMap<String,Boolean> result = moreThanTwoOccurences.checkForOccurences(arr);

        assertEquals(expected,result);
    }
}