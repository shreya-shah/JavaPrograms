import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FindAllOccurences {
    public void findOccurences(String input,String search){
        Pattern pattern = Pattern.compile(search);
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){
            System.out.println("Found at: " + matcher.start()+"-"+matcher.end());
        }
    }

    public static void main(String[] args) {
        FindAllOccurences  findAllOccurences = new FindAllOccurences();
        findAllOccurences.findOccurences("She sells seashells by the seashore","se");
    }
}
