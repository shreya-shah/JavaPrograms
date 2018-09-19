import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionOfMatrixTest {
    AdditionOfMatrix additionOfMatrix;
    @Before
    public void setUp() throws Exception {
        additionOfMatrix = new AdditionOfMatrix();
    }

    @After
    public void tearDown() throws Exception {
        additionOfMatrix = null;
    }

    @Test
    public void testAddition(){
        // arrange
        int[][] expected = new int[][]{{10,10},{10,10},{10,10}};
        // act
        int[][] result = additionOfMatrix.addTwoMatrix(3,2,new int[][]{{1,2},{3,4},{5,6}},new int[][]{{9,8},{7,6},{5,4}});
        // assert
        assertEquals(expected,result);
    }

    @Test
    public void testForNull(){
        // arrange
        int[][] expected = null;
        // act
        int[][] result = additionOfMatrix.addTwoMatrix(0,3,null,null);
        // assert
        assertEquals(expected,result);
    }

    @Test
    public void testForInvalidInput(){
        //arrange
        int[][] expected = new int[][]{{},{},{}};
        //act
        int[][] result = additionOfMatrix.addTwoMatrix(3,0,new int[][]{{},{},{}},new int[][]{{},{},{}});
        // assert
        assertEquals(expected,result);
    }


}