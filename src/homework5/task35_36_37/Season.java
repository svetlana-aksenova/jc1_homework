package homework5.task35_36_37;

import java.util.Scanner;

public enum Season {

    WINTER("It's winter! Christmas time!", 90),
    SPRING("It's spring! Easter is coming!", 91),
    SUMMER("It's summer! Let's go to the beach!", 92),
    AUTUMN("It's autumn! Helloween is coming!", 92);

    private final String description;

    private final int countOfDays;

    Season(String description, int countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }

    public String getDescription() {
        return description;
    }

    public int getCountOfDays() {
        return countOfDays;
    }

    public static void showNextSeason(String str) {
        if (checkData(str)) {
            Season season = strToEnum(str);
            if (season.ordinal() < 3) {
                System.out.println("Next season is " + Season.values()[(season.ordinal() + 1)]);
            } else {
                System.out.println("Next season is " + Season.values()[0]);
            }
        } else {
            System.out.println("There is no such season, please enter correct data");
        }
    }

    public static String enterTheSeason() {
        System.out.println("Select season: WINTER, SPRING, SUMMER, AUTUMN");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.toUpperCase();
        return str;
    }

    public static Season strToEnum(String str) {
        switch (str) {
            case ("WINTER"):
                return Season.WINTER;
            case ("SPRING"):
                return Season.SPRING;
            case ("SUMMER"):
                return Season.SUMMER;
            case ("AUTUMN"):
                return Season.AUTUMN;
            default:
                return null;
        }
    }

    public static boolean checkData(String str) {
        if (str.equals(Season.WINTER.name()) || str.equals(Season.SPRING.name()) || str.equals(Season.SUMMER.name()) ||
                str.equals(Season.AUTUMN.name())) {
            return true;
        } else
            return false;
    }


    public static void showCountOfDays(String str) {

        if (checkData(str)) {
            Season season = strToEnum(str);
            System.out.println("Season " + season + " has " + season.getCountOfDays() + " days");

        } else System.out.println("There is no such season, please enter correct data");
    }

}
