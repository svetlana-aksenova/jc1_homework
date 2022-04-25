package homework7.task50;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import static homework7.task50.Data.*;

public class Main {

    public static void main(String[] args) throws IOException {

        String path = enterPath();
        FileFolder fileFolder = new FileFolder(path);
        fileFolder.createAChainOfThreeFolders();

        ArrayList<String> fileNames = createFileNames(fileFolder, getNumberOfFiles());
        System.out.println(fileNames);

        FileFolder ff1 = new FileFolder(fileNames.get(0));
        ff1.writeText();
        FileFolder ff2 = new FileFolder(fileNames.get(1));
        ff2.writeText();
        FileFolder ff3 = new FileFolder(fileNames.get(2));
        ff3.writeText();
        FileFolder ff4 = new FileFolder(fileNames.get(3));
        ff4.writeText();
        FileFolder ff5 = new FileFolder(fileNames.get(4));
        ff5.writeText();

        File file1 = new File(fileNames.get(0));
        File file2 = new File(fileNames.get(1));
        File file3 = new File(fileNames.get(2));
        File file4 = new File(fileNames.get(3));
        File file5 = new File(fileNames.get(4));
        File all = new File(fileFolder.getPath() + "\\all");

        ArrayList<String> fileList = createListOfFiles(file1, file2, file3, file4, file5);
        writeDataFromOtherFiles(fileList, all);

        File file = new File(path);
        ArrayList<String> content = createСontent(file);
        File fileContent = new File(path + "\\content");
        writeText(content, fileContent);

    }
}
