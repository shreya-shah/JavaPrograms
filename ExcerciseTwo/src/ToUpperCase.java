import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class ToUpperCase {
    public static void main(String[] args) {
        String text = "";
        try{
            Scanner sc = new Scanner(new File("src/a1.txt"));
            while(sc.hasNextLine()){

                text = text + sc.nextLine() + "\n";
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        text = text.toUpperCase();

        System.out.println(text);
    }
}
