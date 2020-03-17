package Execute;

public class TranslateWord implements Itranslate {

    public TranslateWord() {
    }

    @Override
    public void translateToVietNamese(String New_Word) {
        if (ReadFileDictionary.listWord.containsKey(New_Word)){
            System.out.println("Meaning of word: " + ReadFileDictionary.listWord.get(New_Word));
        }else
            System.out.println("Not found meaning of word!");
//        for (Map.Entry<String,String> entry: listWord.entrySet()){
//            if (entry.getKey().equals(word)){
//                System.out.println(entry.getValue());
//            }
//        }
    }
}
