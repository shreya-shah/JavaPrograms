public class Exceptions {
    public static void main(String[] args) {
        generateExceptions();
    }

    public static void generateExceptions() {
        String name = null;
        try{
            System.out.println(name.length());
            int[] array = new int[-20];
            int[] newArray = {1,2,3,4};
            newArray[5] = 10;
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }catch(NegativeArraySizeException e){
            System.out.println(e.getMessage());
        }catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

    }
}
