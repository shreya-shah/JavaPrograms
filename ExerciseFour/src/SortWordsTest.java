import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortWordsTest {
    SortWords sortWords;
    @Before
    public void setUp() throws Exception {
        sortWords = new SortWords();
    }

    @After
    public void tearDown() throws Exception {
        sortWords = null;
    }

    @Test
    public void checkForSortedArray(){
        String[] expected = { "hello", "is", "my", "name", "shreya", "world" };
        String[] result = sortWords.getSortedWords("hello world my name is shreya");
        assertEquals(expected,result);

        expected = new String[]{"!","?","are","hello","how","world","you"};
        result = sortWords.getSortedWords("hello world ! how are you ?");
        assertEquals(expected,result);
    }
}