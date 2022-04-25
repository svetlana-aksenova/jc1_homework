package homework7.task51;

import java.io.File;
import java.util.ArrayList;

import static homework7.task47.TextEntry.enterPath;
import static homework7.task50.Data.*;

import static homework7.task51.Generator.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = getArrayOfRandomPersons(enterNumber());
        System.out.println(list);

        File file = new File(enterPath());
        writeText(list, file);


    }
}
