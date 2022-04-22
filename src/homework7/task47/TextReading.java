package homework7.task47;

import java.io.*;

public class TextReading {

    private String pathToFile;

    public TextReading(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    public StringBuilder readFile(String pathToFile) {
        String s = "";
        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(pathToFile))) {
            while (true) {
                try {
                    if (!((s = br.readLine()) != null)) break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                sb.append(s + " ");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return sb;


    }
}
