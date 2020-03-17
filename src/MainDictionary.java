import Translate.ReadFileDictionary;

import java.util.Scanner;

public class MainDictionary {
    public static void main(String[] args) {

//            ReadFileDictionary readFile = new ReadFileDictionary();

//        Translate.TranslateWord translateWord = new Translate.TranslateWord();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter word: ");
            String newWord = scanner.nextLine();

            ReadFileDictionary.readFile("F:\\CodeGym\\Module2\\Case Study\\Translate\\src\\index.txt");
//        translateWord.translate(newWord);
//        Translate.ReadFileDictionary.translate(newWord);

    }
}
