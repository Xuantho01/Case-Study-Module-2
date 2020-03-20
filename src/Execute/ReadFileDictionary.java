package Execute;
import java.io.*;
import java.util.*;


public class ReadFileDictionary implements IRead_File {

    public ReadFileDictionary() {}

    public static Map<String, String> wordList = new HashMap<>();

    @Override
    public void readFromDictionaryFile(String pathOfFile) throws IOException {
        File file = new File(pathOfFile);
        String cutToCharInFile = "=";
        try {
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            String line = "";
            BufferedReader input = new BufferedReader(new FileReader(file));
            while ((line = input.readLine()) != null){
                String[] Word_List = line.split(cutToCharInFile);
                wordList.put(Word_List[0],Word_List[1]);
            }
            input.close();
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println(wordList);
    }
}
