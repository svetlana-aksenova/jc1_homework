package homework6.task45;

import homework6.task44.ScannerException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double b = 0;
        try {
            if (a < 0) {
                throw new ScannerException("Enter number>0");
            }
            b = getSquareRoot(a);
        } catch (ScannerException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(b);


    }

    public static double getSquareRoot(int a) throws Exception {
        return Math.sqrt(a);
    }

}
