import java.util.Scanner;

public class EvenNumTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println();
        if(isEven(num)){
            System.out.printf("%d is an even number%n",num);
        }else{
            System.out.printf("%d is an odd number%n",num);
        }
    }

    public static boolean isEven(int num){
        if(num == 0){
            return false;
        }

        if(num % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
