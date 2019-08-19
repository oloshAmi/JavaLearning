package encryptdecrypt;

import java.io.IOException;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String direction = "";
        String input = "";
        int key = 0;
        String ipSource = "";
        String opTarget = "";
        String algType = "";
        CryptoVendor vendor = new CryptoVendor();
        FileMaster opFile = new TextFiles();


        for (int i = 0; i < args.length; i++) {
            if (args[i].equalsIgnoreCase("-mode")) {
                direction = args[i + 1];
            } else if (args[i].equalsIgnoreCase("-data")) {
                input = args[i + 1];
            } else if (args[i].equalsIgnoreCase("-key")) {
                key = Integer.parseInt(args[i + 1]);
            } else if (args[i].equalsIgnoreCase("-in")) {
                ipSource = args[i + 1];
            } else if (args[i].equalsIgnoreCase("-out")) {
                opTarget = args[i + 1];
            } else if (args[i].equalsIgnoreCase("-alg")) {
                algType = args[i + 1];
            }
        }
        if (algType.isEmpty()) {
            System.out.println("No algorithm specified!");
            System.exit(1);
        }

        if (direction.isEmpty()) {
            direction = "enc";
        }

        if (input.isEmpty() && ipSource.isEmpty()) {
            input = sc.nextLine();
            key = sc.nextInt();
        } else {
            try {
                FileMaster inputFile = new TextFiles();
                input = inputFile.readFile(ipSource);

            } catch (Exception e) {
                System.out.printf("An exception occurs %s", e.getMessage());
            }
        }

        vendor.execute(algType, direction, input, key, opFile, opTarget);

        sc.close();
    }

}


