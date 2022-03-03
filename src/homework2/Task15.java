package homework2;

import jdk.swing.interop.SwingInterOpUtils;

import static java.lang.Math.sqrt;

public class Task15 {
    public static void main(String[] args) {
        int i, j;
        int counter = 0;

        for (i = 50; i <= 70; i++) {
            int a = (int) sqrt(i) + 1;
            boolean isPrime = true;

            for (j = 2; j <= a; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                counter++;
            }

            if (counter == 2) {
                System.out.println("Второе простое число в интервале от 50 до 70 - " + i);
                break;
            }


        }
    }
}
