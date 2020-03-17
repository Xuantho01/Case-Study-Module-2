package Execute;

public interface IEditFileDictionary {

    void writeToFile(String path, String WordToWrite);

    void removeElement(String path, String WordToRemove);
}
