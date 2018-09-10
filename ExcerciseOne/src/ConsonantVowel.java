import java.util.Scanner;

public class ConsonantVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.next();
        char[] letters = word.toCharArray();
        for (int i=0;i<letters.length;i++){
            char choice = letters[i];
            if(! Character.isAlphabetic(choice)){
                System.out.println("Input is not a letter");
                break;
            }else{
                switch(choice){
                    case 'a':
                    case 'A':
                    case 'e':
                    case 'E':
                    case 'i':
                    case 'I':
                    case 'o':
                    case 'O':
                    case 'u':
                    case 'U':
                        System.out.print("Vowel ");
                        break;
                    default:
                        System.out.print("Consonant ");
                }
            }
        }
    }
}
