package Execute;

import java.io.IOException;
import java.util.*;

public class TranslateWord extends ReadFileDictionary implements ITranslate {

    Scanner scanner = new Scanner(System.in);
    private int countWordAppend = 0;
    String PathOfFile = "F:\\CodeGym\\Module2\\Case Study\\Translate\\src\\index.txt";

    public TranslateWord() {
    }

    private Map<String, String> SearchedWordList = new HashMap<>();

    @Override
    public void VietNameseLanguage(String pathOfFile) throws IOException {

        System.out.println("Enter word to translate: ");

        String New_Word = scanner.nextLine();

        readFromDictionaryFile(pathOfFile);

        String regex = ".*" + New_Word.toLowerCase() + ".*";

        System.out.println(wordList);

        for (Map.Entry<String, String> entry : wordList.entrySet()) {
            if (entry.getKey().matches(regex)) {
                SearchedWordList.put(entry.getKey(), entry.getValue());
                countWordAppend++;
            }
        }
    }

    public void DisplayMeanOfWord() throws IOException {
        VietNameseLanguage(PathOfFile);

        if (countWordAppend != 0) {
            for (Map.Entry<String, String> entry : SearchedWordList.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
            countWordAppend = 0;
            SearchedWordList.clear();
        } else
            System.out.println("not found!");
    }
}

