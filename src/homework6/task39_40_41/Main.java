package homework6.task39_40_41;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;

public class Main {

    public static int negativeMark = 3; // this mark and marks below this one are unsatisfactory


    public static void main(String[] args) {

        System.out.println("Task 39");
        ArrayList<Integer> marks = new ArrayList<>();
        fillArrayList(marks, 20);
        System.out.println("Source array " + marks);
        deleteNegativeMarks(marks);
        System.out.println("Array after removing negative marks " + marks); // Task 39

        System.out.println("Task 40");
        ArrayList<Integer> list = new ArrayList<>();
        fillArrayList(list, 20);
        System.out.println("Source array " + list);
        ArrayList<Integer> filteredList = list.stream().distinct().collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Filtered array " + filteredList); //Task 40

        System.out.println("Task 41");
        ArrayList<Integer> marks2 = new ArrayList<>();
        fillArrayList(marks2, 20);
        System.out.println("Max mark is " + findMax(marks2));


    }

    public static void fillArrayList(ArrayList<Integer> list, int elements) {
        if (elements <= 0) {
            System.out.println("Enter correct data. Elements>0");
        }
        for (int i = 0; i < elements; i++) {
            list.add(i, (int) (Math.random() * 10 + 1));
        }

    }

    public static void deleteNegativeMarks(ArrayList<Integer> list) {
        list.removeIf(a -> a <= negativeMark);

    }

    public static Integer findMax(ArrayList<Integer> list) {
        int max = list.get(0);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (max < iterator.next()) {
                max = iterator.next();
            }
        }
        return max;
    }


}
