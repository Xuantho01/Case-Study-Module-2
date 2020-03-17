package Translate;

import java.io.*;
import java.util.*;

public class ReadFileDictionary {

    public ReadFileDictionary() {
    }

    static Map<String, String> listWord = new HashMap<>();

    public static void readFile(String pathOfFile) {

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

    public static void translate(String newWord){
        if (listWord.containsKey(newWord)){
            System.out.println("Meaning of word: " + listWord.get(newWord));
        }else
            System.out.println("Not found meaning of word!");

//        for (Map.Entry<String,String> entry: listWord.entrySet()){
//            if (entry.getKey().equals(word)){
//                System.out.println(entry.getValue());
//            }
//        }
    }

}
