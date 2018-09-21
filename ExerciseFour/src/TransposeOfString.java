import java.util.Arrays;

public class TransposeOfString {

    public String getTranspose(String input) {
        String[] words = input.split(" ");
        StringBuilder stringBuilder;
        for (int i=0;i<words.length;i++){
            stringBuilder = new StringBuilder(words[i]);
            words[i] = stringBuilder.reverse().toString();
        }
        StringBuilder transposedBuilder = new StringBuilder();
        for (int i=0;i<words.length;i++){
            transposedBuilder.append(words[i]);
            if(i<words.length-1){

            transposedBuilder.append(" ");}
        }

        return transposedBuilder.toString();
    }
}
