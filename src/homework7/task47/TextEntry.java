package homework7.task47;

import java.io.*;
import java.util.Scanner;

public class TextEntry {

    private final String pathToFile;

    public TextEntry(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    public void writeText() {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter text. Input terminator string 'stop'");
        try (FileWriter fw = new FileWriter(pathToFile)) {
            do {
                System.out.print(": ");
                str = br.readLine();
                if (str.compareTo("stop") == 0) {
                    break;
                }
                str = str + "\r\n";
                fw.write(str);
            } while (str.compareTo("stop") != 0);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
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
