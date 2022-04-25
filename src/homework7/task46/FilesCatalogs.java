package homework7.task46;

import java.io.File;
import java.util.ArrayList;

public class FilesCatalogs {

    private static String path;
    private static ArrayList<String> files;
    private static ArrayList<String> catalogs;

    public FilesCatalogs(String path) {
        this.path = path;
        announceArrayLists();
    }

    public void announceArrayLists() {
        files = new ArrayList<String>();
        catalogs = new ArrayList<String>();
    }

    public void defineFilesAndCatalogs() {
        if (checkFolderForExistence(path)) {
            File file = new File(path);
            if (file.isDirectory()) {
                for (File item : file.listFiles()) {
                    if (item.isDirectory()) {
                        catalogs.add(item.getName());
                    } else {
                        files.add(item.getName());
                    }

                }
            } else {
                System.out.println("The file is located at the specified path");
            }
        }
    }

    public static boolean checkFolderForExistence(String path) {
        File file = new File(path);
        if (file.exists()) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<String> getFiles() {
        return files;
    }

    public ArrayList<String> getCatalogs() {
        return catalogs;
    }

}
