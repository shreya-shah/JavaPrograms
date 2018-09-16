public class Factorial64Bit {
    public static void main(String[] args) {
        long largestLong = Long.MAX_VALUE;
        for (int i=1;;i++){
            if(getFactorial(i)>=largestLong){
                break;
            }else{
                System.out.printf("The factorial of %d is %d",i,getFactorial(i));
                System.out.println();
            }
        }

    }

    public static long getFactorial(int num){
        long f = 1;

        if(num==0 || num==1){
            return 1;
        }

        for(int j=2;j<=num;j++){
            f = f * j;
        }

        return f;
    }
}


