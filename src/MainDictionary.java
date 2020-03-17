import Execute.ReadFileDictionary;
import Execute.TranslateWord;

import java.util.Scanner;

public class MainDictionary {
    public static void main(String[] args) {

        ReadFileDictionary readFile = new ReadFileDictionary();

        TranslateWord translate = new TranslateWord();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word: ");
        String new_Word = scanner.nextLine();

        readFile.readFileFromDictionary("F:\\CodeGym\\Module2\\Case Study\\Translate\\src\\index.txt");
        translate.translateToVietNamese(new_Word);

    }
}
