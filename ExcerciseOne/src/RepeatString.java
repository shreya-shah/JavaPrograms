import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();
        String repeat = str;
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            repeat = repeat + str.substring(str.length() - n);
        }

        System.out.println(repeat);

    }
}
