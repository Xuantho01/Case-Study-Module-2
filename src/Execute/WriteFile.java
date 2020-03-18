package Execute;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

public class WriteFile extends ReadFileDictionary {

    public void writeToFile(String path) throws IOException {

        File file = new File(path);

        bufferWrite(file, listWord.entrySet());
    }

    public static void bufferWrite(File file, Set<Map.Entry<String, String>> entries) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        for (Map.Entry<String, String> entry : entries) {
            bufferedWriter.write(String.valueOf(entry));
            bufferedWriter.newLine();
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }

}
