package Execute;

import java.io.IOException;

public interface Proxy {

    void editManagement(String pathOfFile);

    void removeManagement(String PathOfFile) throws IOException;

    void addWordManagement(String PathOfFile);
}
