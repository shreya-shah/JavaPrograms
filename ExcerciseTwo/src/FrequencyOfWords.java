import java.io.*;
import java.util.*;

public class FrequencyOfWords {
    public void getFrequency(String fileName){
        File file = new File(fileName);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String lines = "";
        try{
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while((line=bufferedReader.readLine()) != null){
                lines = lines +  line + " ";
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        String[] words = lines.split(" ");
        HashMap<String,Integer> map =  new HashMap<String, Integer>();
        int count;
        for(String word:words){
            if(map.get(word)==null){
                map.put(word,1);
            }else{
                map.put(word,map.get(word)+1);
            }
        }

        System.out.println(map);

        Set<String> wordKeys = map.keySet();
        Iterator<String> iterator = wordKeys.iterator();
        String word;
        while(iterator.hasNext()){
            word = iterator.next();
            System.out.println(word + "-" + map.get(word));
        }

    }

    public static void main(String[] args) {
        FrequencyOfWords frow = new FrequencyOfWords();
        frow.getFrequency("src/file1.txt");
    }
}
