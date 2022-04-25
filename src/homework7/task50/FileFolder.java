package homework7.task50;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FileFolder {

    private String path;

    public FileFolder(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void createAChainOfThreeFolders() {
        File files = new File(path);
        if (!files.exists()) {
            if (files.mkdirs()) {
                System.out.println("Multiple directories are created");
            } else {
                System.out.println("Failed to create multiple directories");
            }
        }
    }

    public void writeText() {
        ArrayList<Integer> list = new ArrayList<>();
        list = fillArrayList(addSize());
        FileWriter filewriter = null;
        try {
            filewriter = new FileWriter(new File(path));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (int i = 0; i < list.size() - 1; i++) {
            try {
                filewriter.write(list.get(i) + " ");
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        try {
            filewriter.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static ArrayList<Integer> fillArrayList(int size) {
        ArrayList<Integer> list = new ArrayList<>();
        if (size <= 0) {
            System.out.println("Wrong data. Enter number>0");
        } else {
            for (int i = 0; i <= size; i++) {
                list.add(getRandomNumber());
            }
        }
        return list;
    }

    public static int addSize() {
        System.out.println("Enter the required number of numbers");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        return size;
    }

    private static int getRandomNumber() {
        Random random = new Random();
        int a = random.nextInt(100);
        return a;
    }
}
