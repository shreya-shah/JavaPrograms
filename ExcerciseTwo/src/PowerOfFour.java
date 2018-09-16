import java.util.Scanner;

public class PowerOfFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int n = num;
        PowerOfFour powerOfFour = new PowerOfFour();
        boolean isPowerOfFour = powerOfFour.isPowerOfFour(n);

        if(isPowerOfFour){
            System.out.printf("%d is a power of four%n",num);
        }else{
            System.out.printf("%d is not a power of four",num);
        }
    }

    public boolean isPowerOfFour(long n){
        long num = n;
        while(n>1){
            n = n/4;
            if(n%4 != 0){
                return false;
            }
        }

        if(n == 1){
            return true;
        }else{
            return false;
        }
    }
}
