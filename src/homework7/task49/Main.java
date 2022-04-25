package homework7.task49;

import java.util.ArrayList;

import static homework7.task47.TextEntry.enterPath;
import static homework7.task49.ListOfNumbers.getAverage;
import static homework7.task49.TextBinary.addSize;


public class Main {

    public static void main(String[] args) {
        String path = enterPath();
        int number = addSize();

        ListOfNumbers list = new ListOfNumbers(number);
        System.out.println("ArrayList of random numbers: " + list.getListOfNumbers());
        TextBinary tb = new TextBinary(path);
        tb.writeBinary(list);

        ArrayList<Integer> list2 = tb.readBinary();
        System.out.println("ArrayList read from file: " + list2);
        System.out.println("Average: " + getAverage(list2));

    }

}
