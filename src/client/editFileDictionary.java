package client;

import Execute.IEditFileDictionary;
import Execute.Isort;
import Execute.ReadFileDictionary;
import Execute.WriteFile;

import java.io.*;
import java.util.*;
import java.util.function.BiFunction;

public class editFileDictionary extends ReadFileDictionary implements IEditFileDictionary, Isort {

    WriteFile writeFile = new WriteFile();

//    public editFileDictionary() {
//    }

    @Override
    public void addNew_Word(String path, String wordToWrite) {
        try {

            FileWriter myWrite = new FileWriter(path, true);
            BufferedWriter out = new BufferedWriter(myWrite);

            out.write(wordToWrite);
            System.out.println("Successfully wrote to the file!");
            out.close();

        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }

    @Override
    public void removeElement(String path, String WordToRemove) throws IOException {

        readFileFromDictionary(path);

        System.out.println(listWord);

        listWord.remove(WordToRemove);

        writeFile.writeToFile(path);

        System.out.println(listWord);


    }

    public void edit(String path, String key, String value) {

        try {

            readFileFromDictionary(path);

            System.out.println(listWord);

            listWord.replace(key, value);

            System.out.println(listWord);

            writeFile.writeToFile(path);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void save_File(String path) throws IOException {

        File file = new File(path);

        readFileFromDictionary(path);

        TreeMap<String, String> sorted = new TreeMap<>(listWord);
        Set<Map.Entry<String, String>> entries = sorted.entrySet();

        System.out.println(entries);

        WriteFile.bufferWrite(file, entries);

    }
}
