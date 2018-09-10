import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int n = 0;
        int sum = 0;
        boolean isInteger = true;
        try {
            while((n=sc.nextInt())!=0){
                sum += n;
            }
        }catch (InputMismatchException e){
            System.out.println("Only Integer Values Allowed");
            isInteger = false;
        }

        if(isInteger){
            System.out.println("Sum= "+sum);
        }
    }
}
