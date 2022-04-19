package homework7.task47;

import java.io.*;
import java.util.Scanner;

public class TextEntry {

    private final String pathToFile;

    public TextEntry(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    public void writeText(String text) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(pathToFile);
            fos.write(textToByte(text));
            System.out.println("File written successfully");

        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static String enterPath() {
        System.out.println("Enter path to file");
        return new Scanner(System.in).nextLine();
    }

    public static String enterText() {
        System.out.println("Enter text");
        return new Scanner(System.in).nextLine();
    }

    public static byte[] textToByte(String text) {
        return text.getBytes();
    }

    public String getPathToFile() {
        return pathToFile;
    }
}
