import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SetToArrayList {
    public ArrayList<String> toArrayList(String input){
        String[] inputArr = input.split(" ");
        Set<String> sortedSet = new TreeSet<String>(Arrays.asList(inputArr));
        ArrayList<String> sortedList = new ArrayList<>(sortedSet);
        System.out.println(sortedList);
        return sortedList;
    }
}
