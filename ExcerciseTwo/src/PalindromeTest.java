import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome palindrome;
    @Before
    public void setUp() throws Exception {
        palindrome = new Palindrome();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkForEmptyString(){
        //arrange
        boolean expected = true;
        //act
        boolean result = palindrome.isPalindrome("");
        //assert
        assertEquals(expected,result);
    }

    @Test
    public void checkForNull(){
        //arrange
        Boolean expected = null;
        //act
        Boolean result = palindrome.isPalindrome(null);
        //assert
        assertEquals(expected,result);
    }

    @Test
    public void checkForValidInput(){
        //arrange
        boolean expected = true;
        //act
        boolean result = palindrome.isPalindrome("nitin");
        //assert
        assertEquals(expected,result);
    }

    @Test
    public void checkForInvalidInput(){
        //arrange
        boolean expected = false;
        //act
        boolean result = palindrome.isPalindrome("hello world");
        //assert
        assertEquals(expected,result);
    }
}