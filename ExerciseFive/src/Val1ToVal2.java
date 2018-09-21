import java.util.Map;

public class Val1ToVal2 {
    public Map<String,String> replaceVal2(Map<String,String> input){
        if(input.get("val1") != null){
            input.put("val2",input.get("val1"));
            input.put("val1"," ");
        }

        return input;
    }
}


