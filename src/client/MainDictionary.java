package client;

import Execute.ReadFileDictionary;
import Execute.TranslateWord;

import java.io.IOException;
import java.util.Scanner;

public class MainDictionary {
    public static void main(String[] args) throws IOException {

        ReadFileDictionary readFile = new ReadFileDictionary();

        TranslateWord translate = new TranslateWord();

        editFileDictionary add_New_Word = new editFileDictionary();
//
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter word: ");
//        String new_Word = scanner.nextLine();
        String path = "F:\\CodeGym\\Module2\\Case Study\\Translate\\src\\index.txt";
//
//       // readFile.readFileFromDictionary(path);
//        translate.translateToVietNamese(path, new_Word);
//
//        System.out.println("Enter keyWord to remove: ");
//        String word = scanner.nextLine();
//        add_New_Word.removeElement("F:\\CodeGym\\Module2\\Case Study\\Translate\\src\\index.txt", word);
//
//        System.out.println("Enter keyWord to edit key: ");
//        String wordKey = scanner.nextLine();
//
//        System.out.println("Enter keyWord to edit Value: ");
//        String wordValue = scanner.nextLine();
//        add_New_Word.edit(path, wordKey, wordValue);

        add_New_Word.sortKey(path);

        System.out.println("Enter word to add : ");
        String Word = scanner.nextLine();

        add_New_Word.addNew_Word(path, Word);

//        add_New_Word.addNew_Word(path, Word);

    }
}
