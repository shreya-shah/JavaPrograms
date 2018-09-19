import java.util.Scanner;

public class CheckConsecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter comma seperated numbers");
        String digits = sc.nextLine();
        CheckConsecutive checkConsecutive = new CheckConsecutive();
        if(checkConsecutive.isConsecutive(digits)){
            System.out.println(digits+" are consecutive numbers");
        }else{
            System.out.println(digits+" are non-consecutive numbers");
        }
    }

    public boolean isConsecutive(String s){
        boolean isNegative = true;
        String[] digits = s.split(",");
        long[] longDigits = new long[digits.length];
        for (int i=0;i<longDigits.length;i++){
            longDigits[i] = Long.parseLong(digits[i].trim());
        }

        for (int j=1;j<longDigits.length;j++){
            if(Math.abs(longDigits[0] - longDigits[j])!=j){
                return false;
            }
        }

        return true;
    }
}
