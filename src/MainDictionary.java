import Execute.ReadFileDictionary;
import Execute.TranslateWord;

import java.util.Scanner;

public class MainDictionary {
    public static void main(String[] args) {

        ReadFileDictionary readFile = new ReadFileDictionary();

        TranslateWord translate = new TranslateWord();

        editFileDictionary add_New_Word = new editFileDictionary();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word: ");
        String new_Word = scanner.nextLine();

//        readFile.readFileFromDictionary("F:\\CodeGym\\Module2\\Case Study\\Translate\\src\\index.txt");
//        translate.translateToVietNamese(new_Word);
//
//        System.out.println("Enter word to add : ");
//        String Word = scanner.nextLine();
//        add_New_Word.writeToFile("F:\\CodeGym\\Module2\\Case Study\\Translate\\src\\index.txt", Word);
        System.out.println("Enter keyWord to remove: ");
        String word = scanner.nextLine();
        add_New_Word.removeElement("F:\\CodeGym\\Module2\\Case Study\\Translate\\src\\index.txt",word);


    }
}
