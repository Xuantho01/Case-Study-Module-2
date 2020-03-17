package Execute;

import Execute.IreadFile;

import java.io.*;
import java.util.*;

public class ReadFileDictionary implements IreadFile {

    public ReadFileDictionary() {}

    static Map<String, String> listWord = new HashMap<>();

    @Override
    public void readFileFromDictionary(String pathOfFile) {
        File file = new File(pathOfFile);
        String cutTo = ":";
        try {
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            String line = "";
            BufferedReader input = new BufferedReader(new FileReader(file));
            while ((line = input.readLine()) != null){
                String[] list = line.split(cutTo);
                listWord.put(list[0],list[1]);
            }
            input.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
