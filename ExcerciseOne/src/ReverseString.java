import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word = sc.nextLine();
        char[] letters = word.toCharArray();
        String reverse = "";
        for(int i=letters.length-1;i>=0;i--){
            reverse = reverse + letters[i];
        }

        System.out.println(reverse);
    }
}
