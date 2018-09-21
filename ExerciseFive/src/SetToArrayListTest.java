import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SetToArrayListTest {
    SetToArrayList setToArrayList;
    @Before
    public void setUp() throws Exception {
        setToArrayList = new SetToArrayList();
    }

    @After
    public void tearDown() throws Exception {
        setToArrayList = new SetToArrayList();
    }

    @Test
    public void toArrayList() {
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Alice");
        expected.add("Bluto");
        expected.add("Eugene");
        expected.add("Harry");
        expected.add("Olive");
        ArrayList<String> result = setToArrayList.toArrayList("Harry Olive Alice Bluto Eugene");
        assertEquals(expected,result);
    }
}