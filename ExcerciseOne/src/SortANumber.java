import java.util.Scanner;

public class SortANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;
        int sortedNumber = 0;
        for (int i = 9; i >= 0; i--)
        {
            int tmpNumber = number;
            while (tmpNumber > 0)
            {
                int digit = tmpNumber % 10;
                if (digit == i)
                {
                    sortedNumber *= 10;
                    sortedNumber += digit;
                    if(digit %2 == 0){
                        sum += digit;
                    }
                }
                tmpNumber /= 10;
            }
        }

        System.out.println("Sorted number in non increasing order: " + sortedNumber);
        System.out.println("Sum of even numbers: " + sum);
        if(sum>15){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
