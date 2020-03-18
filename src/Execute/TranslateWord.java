package Execute;

import java.io.IOException;

public class TranslateWord extends ReadFileDictionary implements Itranslate {

    public TranslateWord() {
    }

    @Override
    public void translateToVietNamese(String path, String New_Word) throws IOException {
        readFileFromDictionary(path);
        String regex = "{A-Wa-w}";
        if (listWord.containsKey(New_Word)){
            System.out.println("Meaning of word: " + listWord.get(New_Word));
        }else
            System.out.println("Not found meaning of word!");
//        for (Map.Entry<String,String> entry: listWord.entrySet()){
//            if (entry.getKey().equals(word)){
//                System.out.println(entry.getValue());
//            }
//        }
    }
}
