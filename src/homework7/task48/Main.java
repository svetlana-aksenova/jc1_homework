package homework7.task48;

import homework7.task47.TextEntry;
import homework7.task47.TextReading;

import java.util.ArrayList;

import static homework7.task47.TextEntry.enterPath;
import static homework7.task48.Number.*;
import static homework7.task48.Text.*;

public class Main {

    public static void main(String[] args) {

        String path = enterPath();
        TextEntry textEntry = new TextEntry(path);
        textEntry.writeText();

        TextReading textReading = new TextReading(path);
        String s = String.valueOf(textReading.readFile(path));

        StringBuilder sb = deleteWords(s);
        String str = stringBuilderToString(sb);
        if (str.equals("")) {
            System.out.println("Text does not contain numbers");
        } else {
            String[] array = textToArray(str);
            int[] nums = stringArrayToInt(array);
            int sum = countSum(nums);
            ArrayList<Integer> list = intArrayToList(nums);

            ArrayList<Integer> filteredList = removeDuplicateNumbers(list);
            System.out.println("All numbers: " + list);
            System.out.println("Sum of all numbers: " + sum);
            System.out.println("Numbers after removing duplicate numbers: " + filteredList);
        }
    }
}
