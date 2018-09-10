import java.util.*;

public class TomJerry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        if(n%2 != 0){
            if(n>=20 && n<=30){
                System.out.println("Tom");
            }
        }else{
            if(n>=20 && n<=30){
                System.out.println("Jerry");
            }
        }
    }
}
