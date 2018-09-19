import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentMarksTest {
    StudentMarks studentMarks;
    @Before
    public void setUp() throws Exception {
        studentMarks = new StudentMarks();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkValidStudentMarks(){
        // arrange
        boolean expected = true;
        // act
        int[] studentGrades = {10,20,56};
        boolean result = studentMarks.checkMarks(studentGrades);
        // assert
        assertEquals(expected,result);

    }

    @Test
    public void checkInvalidStudentMarks(){
        // arrange
        boolean expected = false;
        // act
        int[] studentGrades = {10,90,156};
        boolean result = studentMarks.checkMarks(studentGrades);
        // assert
        assertEquals(expected,result);
    }

    @Test
    public void checkForNull(){
        // arrange
        boolean expected = false;
        // act
        boolean result = studentMarks.checkMarks(null);
        // assert
        assertEquals(expected,result);
    }

}