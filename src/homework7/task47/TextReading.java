package homework7.task47;

import java.io.*;
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
        return s; //TODO: исправить метод,чтобы считывался весь файл, а не только первая сторока
    }

    //*public StringBuilder readFile(String pathToFile) {
    //    StringBuilder sb = new StringBuilder();
    //    FileReader fr = null;
    //    try {
    //        fr = new FileReader(pathToFile);
    //        int c;
    //        while ((c= fr.read()) != -1) {
    //            sb.append((char)c);
    //        }
    //
    //    } catch (FileNotFoundException e) {
    //        System.out.println("Error: file not found " + e.getMessage());
    //    } catch (IOException e) {
    //        System.out.println("Error " + e.getMessage());
    //    }
    //    return sb;*/


}
