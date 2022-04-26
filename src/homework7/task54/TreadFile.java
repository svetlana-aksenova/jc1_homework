package homework7.task54;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TreadFile implements Runnable {

    private final Thread thread;
    private final int[] array;
    private String path;

    public TreadFile(String threadName, int[] array, String path) {
        thread = new Thread(this, threadName);
        this.array = array;
        this.path = path;
        thread.start();
    }

    @Override
    public void run() {
        writeFile();
    }

    public void writeFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            for (int i = 0; i < array.length; i++) {
                writer.write((i + 1) + " element: " + array[i] + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }

    public static String enterPath() {
        System.out.println("Enter path to file");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
