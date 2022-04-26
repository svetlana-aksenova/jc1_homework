package homework7.task49;

import java.util.ArrayList;
import java.util.Random;

public class ListOfNumbers {

    private ArrayList<Integer> listOfNumbers;
    private int size;

    public ListOfNumbers(int size) {
        this.listOfNumbers = new ArrayList<>();
        this.size = size;
        listOfNumbers = fillArrayList(size);
    }

    public ArrayList<Integer> getListOfNumbers() {
        return listOfNumbers;
    }

    public int getSize() {
        return size;
    }

    public int getRandomNumber() {
        Random random = new Random();
        int a = random.nextInt(100);
        return a;
    }

    private ArrayList<Integer> fillArrayList(int size) {
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


    public static double getAverage(ArrayList<Integer> list) {
        double average = getSum(list) / list.size();
        return average;
    }

    public static double getSum(ArrayList<Integer> list) {
        double sum = 0;
        for (int number : list) {
            sum += number;
        }
        return sum;
    }
}
