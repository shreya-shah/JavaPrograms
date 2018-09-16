public class Factorial32Bit {
    public static void main(String[] args) {
        int largestInt = Integer.MAX_VALUE;
        System.out.println(largestInt);
        int i = 1;
        for (i=1;;i++){
            if(getFactorial(i)<=largestInt) {
                System.out.println("The factorial of " + i + " is " + getFactorial(i));
            } else
                break;
        }

        System.out.println("The factorial of " + i + " is out of range");

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
