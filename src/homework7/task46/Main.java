package homework7.task46;

import static homework7.task46.UserDisplay.*;

public class Main {

    public static void main(String[] args) {
        enterAnInvitation();

        FilesCatalogs fs = new FilesCatalogs(UserDisplay.enterPath());

        fs.defineFilesAndCatalogs();
        printFiles(fs.getFiles());
        printCatalogs(fs.getCatalogs());

    }

}
