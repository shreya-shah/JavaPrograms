import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int num = r.nextInt(50) + 1;
        int guess;
        while(true){
            System.out.println("Enter a number between 1-50: ");
            guess = sc.nextInt();
            if(guess>num){
                System.out.println("Number guessed is more than original number");
            }else if(guess<num){
                System.out.println("Number guessed is less than original number ");
            }else{
                System.out.println(" Number guessed matches the original number");
                break;
            }
        }
    }
}
