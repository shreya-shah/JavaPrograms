import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class UpdateArrayListTest {
    UpdateArrayList updateArrayList;
    @Before
    public void setUp() throws Exception {
        updateArrayList = new UpdateArrayList();
    }

    @After
    public void tearDown() throws Exception {
        updateArrayList = null;
    }

    @Test
    public void testUpdateArrayList(){
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("Kiwi");
        expected.add("Grape");
        expected.add("Mango");
        expected.add("Berry");

        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Grape");
        list.add("Melon");
        list.add("Berry");

        ArrayList<String> result = updateArrayList.updateArrayList(list,0,"Kiwi",2,"Mango");

        assertEquals(expected,result);
    }

    @Test
    public void checkForEmpty(){
        ArrayList<String> expected = new ArrayList<String>();
        ArrayList<String> list = new ArrayList<>();
        list.add("Kiwi");
        list.add("Grape");
        list.add("Mango");
        list.add("Berry");
        ArrayList<String> result = updateArrayList.emptyArrayList(list);

        assertEquals(expected,result);
    }
}
