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

            System.out.println("Enter new word: ");
            String WordToWrite = scanner.nextLine();

            FileWriter myWriteFile = new FileWriter(PathOfFile, true);
            BufferedWriter outToWrite = new BufferedWriter(myWriteFile);

            outToWrite.write(WordToWrite);
            System.out.println("Successfully wrote to the file!");
            outToWrite.close();

        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }

    @Override
    public void removeElement(String PathOfFile) throws IOException {

        readFromDictionaryFile(PathOfFile);

        System.out.println("Enter word to remove");
        String WordToRemove = scanner.nextLine();

        this.wordList.remove(WordToRemove);

        WRITE_FILE.writeToFile(PathOfFile,this.wordList);

    }

    @Override
    public void editElement(String PathOfFile) {
        try {

            System.out.println("Enter English word to edit");
            String KeyInWordList = scanner.nextLine();
            System.out.println("Enter meaning: ");
            String ValueInWordList = scanner.nextLine();

            readFromDictionaryFile(PathOfFile);

            this.wordList.replace(KeyInWordList, ValueInWordList);

            WRITE_FILE.writeToFile(PathOfFile, this.wordList);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void save_File(String PathOfFile) throws IOException {

        File file = new File(PathOfFile);

        readFromDictionaryFile(PathOfFile);

        TreeMap<String, String> sortFile = new TreeMap<>(wordList);

        Set<Map.Entry<String, String>> entries = sortFile.entrySet();

        WriteFile.bufferWrite(file, entries);

    }
}
