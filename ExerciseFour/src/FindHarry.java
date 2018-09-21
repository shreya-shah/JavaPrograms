import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FindHarry {
    public boolean isHarryHere(String input){
        boolean found = false;
        Pattern pattern = Pattern.compile("Harry");
        Matcher matcher = pattern.matcher(input);
        while(matcher.find()){
            found = true;
        }

        System.out.println("Is Harry here? " + found);

        return found;
    }
}
