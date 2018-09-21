import java.util.Arrays;

public class SortWords {
    public String[] getSortedWords(String input){
        String[] unsortedArray = input.split(" ");
        Arrays.sort(unsortedArray);
        String[] sortedWords = unsortedArray;
        System.out.println(Arrays.toString(sortedWords));
        return sortedWords;
    }
}
