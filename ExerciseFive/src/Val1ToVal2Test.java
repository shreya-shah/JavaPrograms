import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class Val1ToVal2Test {
    Val1ToVal2 val1ToVal2;
    @Before
    public void setUp() throws Exception {
        val1ToVal2 = new Val1ToVal2();
    }

    @After
    public void tearDown() throws Exception {
        val1ToVal2 = null;
    }

    @Test
    public void replaceVal2() {
        Map<String,String> expected = new HashMap<String,String>();
        expected.put("val1"," ");
        expected.put("val2","java");
        Map<String,String> input = new HashMap<String, String>();
        input.put("val1","java");
        input.put("val2","c++");
        Map<String,String> result = val1ToVal2.replaceVal2(input);
    }
}