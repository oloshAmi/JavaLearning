package encryptdecrypt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class TextFiles implements FileMaster {
    public String readFile(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public void writeFile(String opTarget, String textToWrite) throws IOException {
        File file = new File(opTarget);
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(textToWrite);
        } catch (IOException e) {
            System.out.printf("An exception occurs %s", e.getMessage());
        }
    }

}
