package homework5.task35_36_37;

import java.util.Arrays;

import static homework5.task35_36_37.Season.*;


public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(Season.values())); //Task 35

        showNextSeason(enterTheSeason());//Task 36

        showCountOfDays(enterTheSeason());//Task 37


    }


}
