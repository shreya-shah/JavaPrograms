import java.util.Scanner;

public class ThrowException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between 1-20: ");
        int num = sc.nextInt();
        try{
            if(num<1 || num>20){
                throw new Exception("Number is not between 1-20!");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("I reached the finally block");
        }
    }
}

