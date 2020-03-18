import Execute.IEditFileDictionary;
import Execute.ReadFileDictionary;

import java.io.*;
import java.sql.Struct;
import java.util.Map;

public class editFileDictionary extends ReadFileDictionary implements IEditFileDictionary {

    public editFileDictionary() {
    }

    @Override
    public void writeToFile(String path, String wordToWrite) {
        try {

            FileWriter myWrite = new FileWriter(path, true);
            BufferedWriter out = new BufferedWriter(myWrite);

            out.write("\n" + wordToWrite);
            System.out.println("Successfully wrote to the file!");
            out.close();

        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }

    }

    @Override
    public void removeElement(String path, String WordToRemove) throws IOException {

        readFileFromDictionary(path);
        System.out.println(listWord);

        listWord.remove(WordToRemove);

        System.out.println(listWord);

        File file = new File(path);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        for (Map.Entry<String, String> entry : listWord.entrySet()) {

            bufferedWriter.write(String.valueOf(entry));
           // bufferedWriter.write(entry.getKey() , );
            bufferedWriter.newLine();

        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }

    public void edit(String path, String key, String value, String keyToChange) throws IOException {

        readFileFromDictionary(path);

        System.out.println(listWord);

        if (listWord.get(key).equals(keyToChange)){
            listWord.replace(keyToChange,value);
        }

        System.out.println(listWord);

        File file = new File(path);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        for (Map.Entry<String, String> entry : listWord.entrySet()) {

            bufferedWriter.write(String.valueOf(entry));
            // bufferedWriter.write(entry.getKey() , );
            bufferedWriter.newLine();

        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }


}


//    @Override
//    public void removeElement(String path1, String WordToRemove) {
//
//        String path2 = "F:\\CodeGym\\Module2\\Case Study\\Translate\\src\\tmpFile.txt";
//
//        File file = new File(path1);
//        File tempFile = new File(path2);
//
//        String cutTo = ":";
//        try {
//            if (!file.exists()) {
//                throw new FileNotFoundException();
//            }
//
//            String line = "";
//            BufferedReader input = new BufferedReader(new FileReader(file));
//            BufferedWriter out = new BufferedWriter(new FileWriter(tempFile));
//
//            while ((line = input.readLine()) != null) {
//                String[] list = line.split(cutTo);
//                if (list[0].equals(WordToRemove))
//                    continue;
//                out.write(list[0] + ": " + list[1] + "\n");
//            }
//
//            input.close();
//            out.close();
//            updateFile(path1,path2);
//            System.out.println("remove successfully!");
//
//        } catch (Exception e) {
//            System.out.println("Can't remove word!");
//        }
//
//    }
//
//    public void updateFile(String path1, String path2) {
//
//        File file = new File(path1);
//        File tempFile = new File(path2);
//        String cutTo = ":";
//
//        try {
//            if (!file.exists()){
//                throw new FileNotFoundException();
//            }
//
//            String line = "";
//            BufferedReader input = new BufferedReader(new FileReader(tempFile));
//            BufferedWriter out = new BufferedWriter(new FileWriter(file));
//
//            while ((line = input.readLine()) != null){
//                String[] list = line.split(cutTo);
//                out.write(list[0]+": "+list[1]+"\n");
//            }
//
//            input.close();
//            out.close();
//            System.out.println("update successfully!");
//
//        }catch (Exception e){
//            System.out.println("Can't remove word!");
//        }
//    }

