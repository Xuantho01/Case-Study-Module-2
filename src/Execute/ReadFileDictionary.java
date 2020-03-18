package Execute;

import java.io.*;
import java.util.*;


public class ReadFileDictionary implements IRead_File {

//    editFileDictionary EDIT_FILE = new editFileDictionary();

    public ReadFileDictionary() {}

    public Map<String, String> wordList = new HashMap<>();

    @Override
    public void readFromDictionaryFile(String pathOfFile) throws IOException {
        File file = new File(pathOfFile);
        String cutToCharOfFile = "=";
        try {
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            String line = "";
            BufferedReader input = new BufferedReader(new FileReader(file));
            while ((line = input.readLine()) != null){
                String[] Word_List = line.split(cutToCharOfFile);
                wordList.put(Word_List[0],Word_List[1]);
            }
            input.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
