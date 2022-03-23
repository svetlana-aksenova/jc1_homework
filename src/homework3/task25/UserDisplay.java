package homework3.task25;

import java.util.Scanner;

public class UserDisplay {


    public int readData() {
        System.out.println("Enter the required amount");
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        return sum;
    }
}
