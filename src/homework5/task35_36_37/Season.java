package homework5.task35_36_37;

import java.util.Scanner;

public enum Season {

    WINTER("Зима", 90), SPRING("Весна", 91),
    SUMMER("Лето", 92), AUTUMN("Осень", 92);

    private String description;

    private int countOfDays;

    Season(String description, int countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }

}
