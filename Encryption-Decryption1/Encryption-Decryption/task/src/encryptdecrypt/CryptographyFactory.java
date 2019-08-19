package encryptdecrypt;

import java.io.IOException;

public abstract class CryptographyFactory {
    abstract Algorithm createAlgorithm(String type);

    public void execute(String type, String mode, String data, int key, FileMaster outputFile, String opFileName) {
        Algorithm alg = createAlgorithm(type);
        if (alg.equals(null)) {
            System.out.println("Wrong algorithm name");
        } else {

            String outputData = "";
            switch (mode) {
                case "enc":
                    outputData = alg.encrypt(data, key);
                    break;
                case "dec":
                    outputData = alg.decrypt(data, key);
                    break;
                default:
                    System.out.println("No method specified!");
            }
            try {
                outputFile.writeFile(opFileName, outputData);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

