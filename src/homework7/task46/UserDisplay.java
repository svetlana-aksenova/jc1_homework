package homework7.task46;

import java.util.ArrayList;
import java.util.Scanner;

public class UserDisplay {

    public static void enterAnInvitation() {
        System.out.println("Enter directory path");
    }

    public static String enterPath() {
        return new Scanner(System.in).nextLine();
    }

    public static void printFiles(ArrayList<String> list) {
        if (list.isEmpty()) {
            System.out.println("Directory does not contain files");
        } else {
            System.out.println("Directory contains next files: ");
            for (String item : list) {
                System.out.println(item);

            }
        }
    }


    public static void printCatalogs(ArrayList<String> list) {
        if (list.isEmpty()) {
            System.out.println("Directory does not contain catalogs");
        } else {
            System.out.println("Directory contains next catalogs: ");
            for (String item : list) {
                System.out.println(item);

            }
        }
    }


}

