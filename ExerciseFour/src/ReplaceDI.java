public class ReplaceDI {
    public String getReplacedString(String input){
        String replace1 = input.replaceAll("[d]","f");
        String replace2 = replace1.replaceAll("[l]","t");

        return replace2;
    }
}
