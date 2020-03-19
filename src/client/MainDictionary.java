package client;

import Execute.TranslateWord;

import java.io.IOException;
import java.util.Scanner;

public class MainDictionary {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        String PathOfFile = "F:\\CodeGym\\Module2\\Case Study\\Translate\\src\\index.txt";

        TranslateWord TRANSLATE = new TranslateWord();

        editDictionaryFile EDIT_DICTIONARY_FILE = new editDictionaryFile();

        DictionaryProxy DICTIONARY_PROXY = new DictionaryProxy();

        int choice;
        do {

            System.out.println("Enter your choice");
            System.out.println("1. Translate");
            System.out.println("2. Add new word");
            System.out.println("3. Remove word in file");
            System.out.println("4. Edit word in File");
            System.out.println("5. Save file");
            System.out.println("0. Exit!");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    TRANSLATE.VietNameseLanguage(PathOfFile);
                    break;
                case 2:
                    DICTIONARY_PROXY.addWordManagement(PathOfFile);
                    break;
                case 3:
                    DICTIONARY_PROXY.removeManagement(PathOfFile);
                    break;
                case 4:
                    DICTIONARY_PROXY.editManagement(PathOfFile);
                    break;
                case 5:
                    EDIT_DICTIONARY_FILE.save_File(PathOfFile);
                    break;
            }
        } while (choice != 0);
//        int choice;
//        do {
//
//            System.out.println("Enter your choice");
//            System.out.println("1. Translate");
//            System.out.println("2. Add new word");
//            System.out.println("3. Remove word in file");
//            System.out.println("4. Edit word in File");
//            System.out.println("5. Save file");
//            System.out.println("0. Exit!");
//
//            choice = scanner.nextInt();
//            switch (choice) {
//                case 1:
//                    TRANSLATE.VietNameseLanguage(PathOfFile);
//                    break;
//                case 2:
//                    EDIT_DICTIONARY_FILE.addNew_Word(PathOfFile);
//                    break;
//                case 3:
//                    EDIT_DICTIONARY_FILE.removeElement(PathOfFile);
//                    break;
//                case 4:
//                    EDIT_DICTIONARY_FILE.editElement(PathOfFile);
//                    break;
//                case 5:
//                    EDIT_DICTIONARY_FILE.save_File(PathOfFile);
//                    break;
//            }
//        } while (choice != 0);
    }
}
