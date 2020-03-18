package Execute;

import java.io.IOException;

public interface IEditFileDictionary {

    void writeToFile(String path, String WordToWrite);

    void removeElement(String path, String WordToRemove) throws IOException;
}
