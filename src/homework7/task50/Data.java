package homework7.task50;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Data {

    public static String enterPath() {
        System.out.println("Enter the path to create a chain of three folders");
        System.out.println("Example: C:\\folder1\\folder2\\folder3");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static String enterFileName() {
        System.out.println("Enter file name");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.next();
        return "\\" + fileName;
    }

    public static ArrayList<String> createFileNames(FileFolder ff, int numberOfFiles) {
        ArrayList<String> pathToFile = new ArrayList<>();
        for (int i = 0; i < numberOfFiles; i++) {
            pathToFile.add(ff.getPath() + enterFileName());
        }
        return pathToFile;
    }

    public static int getNumberOfFiles() {
        System.out.println("Enter the required number of files");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static ArrayList<String> createListOfFiles(File f1, File f2, File f3, File f4, File f5) {
        ArrayList<String> list = new ArrayList<>();
        list.add(f1.getPath());
        list.add(f2.getPath());
        list.add(f3.getPath());
        list.add(f4.getPath());
        list.add(f5.getPath());
        return list;
    }

    public static void writeDataFromOtherFiles(ArrayList<String> list, File dest) {
        for (int i = 0; i < list.size(); i++) {
            try (FileInputStream fis = new FileInputStream(list.get(i))) {
                try (FileOutputStream fos = new FileOutputStream(dest, true)) {
                    byte[] bytes = new byte[fis.available()];
                    int lenght;
                    while ((lenght = fis.read(bytes)) != -1) {
                        fos.write(bytes);
                    }
                }
            } catch (FileNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static ArrayList<String> createСontent(File file) {
        ArrayList<String> content = new ArrayList<>();
        if (checkFolderForExistence(file.getPath())) {
            for (File item : file.listFiles()) {
                content.add(item.getName());
            }
        }
        return content;
    }

    public static boolean checkFolderForExistence(String path) {
        File file = new File(path);
        if (file.exists()) {
            return true;
        } else {
            return false;
        }
    }

    public static void writeText(ArrayList<String> list, File file) {
        FileWriter filewriter = null;
        try {
            filewriter = new FileWriter(new File(file.getPath()));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (int i = 0; i < list.size(); i++) {
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
}
