package encryptdecrypt;

import java.io.IOException;

public interface FileMaster {
    String readFile(String fileName) throws IOException;
    void writeFile(String fileName, String textToWrite)throws IOException;

}
