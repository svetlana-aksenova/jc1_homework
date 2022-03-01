package homework1;



import java.text.SimpleDateFormat;


import java.time.LocalDate;
import java.util.Calendar;

import java.util.GregorianCalendar;


public class Task9 {
    public static void main(String[] args) {
        int day, month,year;
        day= 5;
        month=5;
        year = 2022;


        LocalDate date = LocalDate.of(year, month, day);
        date= date.plusDays(1);

        System.out.println(date);














    }
}
