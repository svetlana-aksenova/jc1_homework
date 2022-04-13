package homework5.task38;

import java.util.Scanner;

public class Garage<T extends Vehicle> {

    private String name;
    private String number;

    public Garage() {
        System.out.println("Enter information");
        enterData();

    }

    public String getName() {
        return name;
    }

    private String getNumber() {
        return number;
    }

    public void enterData() {
        System.out.println("Enter name:");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Enter number:");
        number = scanner.nextLine();
    }
}
