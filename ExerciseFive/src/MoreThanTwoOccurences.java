import java.util.HashMap;

public class MoreThanTwoOccurences {
    public HashMap<String,Boolean> checkForOccurences(String[] input){
        HashMap<String,Boolean> map = new HashMap<String, Boolean>();
        for (String letter:input){
            if(map.get(letter)==null){
                map.put(letter,false);
            }else{
                map.put(letter,true);
            }
        }
        System.out.println(map);
        return map;
    }
}
