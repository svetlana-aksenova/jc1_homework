package homework2;

import static java.lang.Math.sqrt;

public class Task15 {
    public static void main(String[] args) {

        int i, j;
        int counter = 0;

        for (i = 50; i <= 70; i++) {
            if (isPrime(i)) {
                counter++;
            }

            if (counter == 2) {
                System.out.println("Второе простое число в интервале от 50 до 70 - " + i);
                break;
            }


        }
    }

    private static boolean isPrime(int a) {
        for (int j = 2; j <= (int) sqrt(a) + 1; j++) {
            if (a % j == 0) {
                return false;
            }
        }
        return true;
    }
}
