package homework5.task38;

import java.util.Scanner;

public class Garage<T extends Vehicle> {

    private T vehical;

    //public Garage(String enterCarName, String enterCarNumber) {

    //}

    public T getVehical() {
        return vehical;

    }

    public void setVehical(T vehical) {
        this.vehical = vehical;
    }

    public static String enterCarName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите марку машины");
        String carName = scanner.nextLine();
        return carName;
    }

    public static String enterCarNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер машины");
        String carNumber = scanner.nextLine();
        return carNumber;
    }

    public String enterMotocycleName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите марку мотоцикла");
        String enterMotocycleName = scanner.nextLine();
        return enterMotocycleName;
    }

    public String enterMotocycleNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер мотоцикла");
        String enterMotocycleNumber = scanner.nextLine();
        return enterMotocycleNumber;
    }

}
