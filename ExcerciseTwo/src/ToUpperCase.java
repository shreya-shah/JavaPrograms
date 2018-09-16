import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class ToUpperCase {
    public static void main(String[] args) {
        ToUpperCase toUpperCase = new ToUpperCase();
        String uppperCase = toUpperCase.getInUpperCase("src/a1.txt");
    }

    public String getInUpperCase(String file){
        String text = "";
        try{
            Scanner sc = new Scanner(new File(file));
            while(sc.hasNextLine()){

                text = text + sc.nextLine() + "\n";
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        text = text.toUpperCase();

        return text;
    }
}
