import java.util.Arrays;
import java.util.HashMap;

public class CountWords {
    public HashMap<String,Integer> getWordCount(String input){
        HashMap<String,Integer> count = new HashMap<String, Integer>();
        String[] words = input.split("[^A-Za-z]");
        for (String word:words){
            if(word.length()>=1){
                if(count.get(word)==null){
                    count.put(word,1);
                }else{
                    count.put(word,count.get(word)+1);
                }
            }
        }

        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        CountWords countWords = new CountWords();
        countWords.getWordCount("one one -one___two,,three,one @three*one?two");
    }
}
