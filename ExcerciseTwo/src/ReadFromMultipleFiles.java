import java.io.*;

public class ReadFromMultipleFiles {
    public void readFromFiles(String folder,String extension){
        File file = new File(folder);
        String[] fileNames = file.list();
        for(int i=0;i<fileNames.length;i++){
            if(fileNames[i].endsWith(extension)){
                File innerFile = new File("src/"+fileNames[i]);
                FileInputStream fin = null;
                try{
                    fin = new FileInputStream(innerFile);
                    byte[] fileContent = new byte[(int)innerFile.length()];
                    fin.read(fileContent);
                    String s = new String(fileContent);
                    System.out.println(s);
                }catch(FileNotFoundException e){
                    e.printStackTrace();
                }catch(IOException e){
                    e.printStackTrace();
                }finally{
                    try{
                        if(fin != null){
                            fin.close();
                        }
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        ReadFromMultipleFiles r = new ReadFromMultipleFiles();
        r.readFromFiles("src/",".txt");
    }
}
