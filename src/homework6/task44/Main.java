package homework6.task44;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            int x = enterData();
            if (x <= 0) {
                throw new ScannerException("Error! Enter number>0");
            }
        } catch (ScannerException e) {
            System.out.println(e.getMessage());

        }
    }

    public static int enterData() {
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();

    }

}
