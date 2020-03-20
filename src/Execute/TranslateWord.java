package Execute;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class TranslateWord extends ReadFileDictionary implements ITranslate {

    Scanner scanner = new Scanner(System.in);

    public TranslateWord() {
    }

    @Override
    public void VietNameseLanguage(String pathOfFile) throws IOException {

        System.out.println("Enter word to translate: ");
        String New_Word = scanner.nextLine();

        readFromDictionaryFile(pathOfFile);

        String regex = ".*" + New_Word.toLowerCase()+ ".*";
        System.out.println(wordList);

        for (Map.Entry<String, String> entry : wordList.entrySet()) {
            if (entry.getKey().matches(regex)) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }

    }
}
