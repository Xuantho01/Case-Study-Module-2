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

        ChooseOption(PathOfFile, TRANSLATE, EDIT_DICTIONARY_FILE, DICTIONARY_PROXY);

    }

    public static void ChooseOption(String pathOfFile, TranslateWord TRANSLATE, editDictionaryFile EDIT_DICTIONARY_FILE, DictionaryProxy DICTIONARY_PROXY) throws IOException {
        int choice;
        do {

            System.out.println("Enter your choice");
            System.out.println("1. lookup");
            System.out.println("2. Add new word");
            System.out.println("3. Remove word in file");
            System.out.println("4. Edit word in File");
            System.out.println("5. Save file");
            System.out.println("0. Exit!");

            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                choice = 10;
            }
            scanner.nextLine();
            switch (choice) {
                case 1:
                    TRANSLATE.VietNameseLanguage(pathOfFile);
                    break;
                case 2:
                    DICTIONARY_PROXY.addWordManagement(pathOfFile);
                    break;
                case 3:
                    DICTIONARY_PROXY.removeManagement(pathOfFile);
                    break;
                case 4:
                    DICTIONARY_PROXY.editManagement(pathOfFile);
                    break;
                case 5:
                    EDIT_DICTIONARY_FILE.save_File(pathOfFile);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Wrong Option. Please try again!");
                    break;
            }
        } while (choice != 0);
    }
}
