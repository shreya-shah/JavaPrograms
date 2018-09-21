import java.util.Arrays;
import java.util.Scanner;

public class CharacterOccurences {

    public static void main(String[] args) {
        CharacterOccurences characterOccurences = new CharacterOccurences();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input string: ");
        String input = sc.nextLine();
        System.out.println();
        System.out.print("Enter the character for checking its occurences: ");
        String character = sc.next();
        System.out.println();

        int noOfOccurences = characterOccurences.getCharacterOccurences(input,character);

        System.out.println("The number of occurences of " + character +" : " + noOfOccurences);
    }

    public int getCharacterOccurences(String input,String character){
        if(character.length()==1){
            return input.length()-input.replaceAll(character,"").length();
        }else{
            String[] inputArray = input.split(" ");
            String[] replacedArray = input.replaceAll(character,"").trim().split(" ");
            return inputArray.length - replacedArray.length;
        }
    }

}
