package Execute;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TranslateWord extends ReadFileDictionary implements ITranslate {

    Scanner scanner = new Scanner(System.in);

    public TranslateWord() {
    }

    @Override
    public void VietNameseLanguage(String pathOfFile) throws IOException {

        System.out.println("Enter word to translate: ");
        String New_Word = scanner.nextLine();

        readFromDictionaryFile(pathOfFile);

        String regex = ".*" + New_Word+ ".*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;

        for (Map.Entry<String, String> entry : wordList.entrySet()) {
            matcher = pattern.matcher(entry.getKey());
            if (matcher.find()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
//        if (listWord.containsKey(New_Word)){
//            System.out.println("Meaning of word: " + listWord.get(New_Word));
//        }else
//            System.out.println("Not found meaning of word!");
    }
}
