import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long n = sc.nextLong();
        long n2 = n;
        int sum = 0;
        long rev = 0;
        long x = 0;
        boolean isPalindrome = false;
        while(n2>0){
            x = n2 % 10;
            rev = rev * 10 + x;
            n2 = n2/10;

            if(x%2 == 0){
                sum += x;
            }
        }

        if(rev == n){
            isPalindrome = true;
        }

        if(isPalindrome){
            if(sum>25){
                System.out.printf("%d is a palindrome and the sum of even numbers is greater than 25 %n",n);
            }else{
                System.out.printf("%d is a palindrome and the sum of even numbers is less than 25 %n",n);
            }
        }else{
            System.out.printf("%d is not a palindrome",n);
        }
    }
}
