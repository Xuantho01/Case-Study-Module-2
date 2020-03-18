package Execute;

import java.io.IOException;

public interface IEditFileDictionary {

    void addNew_Word(String pathOfFile);

    void removeElement(String pathOfFile) throws IOException;

    void editElement(String PathOfFile);
}
