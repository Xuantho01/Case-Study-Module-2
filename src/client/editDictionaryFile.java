package client;

import Execute.IEditFileDictionary;
import Execute.ISort;
import Execute.ReadFileDictionary;
import Execute.WriteFile;

import java.io.*;
import java.util.*;

public class editDictionaryFile extends ReadFileDictionary implements IEditFileDictionary, ISort {

    Scanner scanner = new Scanner(System.in);

    WriteFile WRITE_FILE = new WriteFile();

    public editDictionaryFile() {
    }

    @Override
    public void addNew_Word(String PathOfFile) {
        try {

//            System.out.println("Enter new word: ");
//            String WordToWrite = scanner.nextLine();

            System.out.println("Enter new word: ");
            String key = scanner.nextLine();
            System.out.println("Enter new meaning: ");
            String value = scanner.nextLine();

            wordList.put(key, value);

//            FileWriter myWriteFile = new FileWriter(PathOfFile, true);
//            BufferedWriter outToWrite = new BufferedWriter(myWriteFile);
//            outToWrite.write("\n"+WordToWrite);
//            System.out.println("Successfully wrote to the file!");
//            outToWrite.close();

            WRITE_FILE.writeToFile(PathOfFile,wordList);

        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
        System.out.println(wordList);
    }

    @Override
    public void removeElement(String PathOfFile) {
        try {

            readFromDictionaryFile(PathOfFile);

            System.out.println("Enter word to remove");
            String WordToRemove = scanner.nextLine();

            ReadFileDictionary.wordList.remove(WordToRemove);

            WRITE_FILE.writeToFile(PathOfFile,wordList);

            System.out.println(wordList);
            System.out.println("Successfully removed!");

        }catch (Exception e){
            System.out.println("An error!");
        }

    }

    @Override
    public void editElement(String PathOfFile) {
        try {

            System.out.println("Enter English word to edit");
            String KeyInWordList = scanner.nextLine();
            System.out.println("Enter meaning: ");
            String ValueInWordList = scanner.nextLine();

            readFromDictionaryFile(PathOfFile);

            wordList.replace(KeyInWordList, ValueInWordList);
            System.out.println(wordList);
            WRITE_FILE.writeToFile(PathOfFile, wordList);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void save_File(String PathOfFile) {

        try {
            File file = new File(PathOfFile);

            readFromDictionaryFile(PathOfFile);

            TreeMap<String, String> sortFile = new TreeMap<>(wordList);

            Set<Map.Entry<String, String>> entries = sortFile.entrySet();
            System.out.println(entries);
            WriteFile.bufferWrite(file, entries);

        }catch (Exception e){
            System.out.println(e);
        }

    }
}
