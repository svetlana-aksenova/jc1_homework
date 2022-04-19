package homework7.task47;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextReading {

    private String pathToFile;

    public TextReading(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    public String readFile(String pathToFile) {
        String s = new String();
        File file = new File(pathToFile);
        try {
            Scanner scanner = new Scanner(file);
            s = scanner.nextLine();
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());

        }
        return s;
    }


}
