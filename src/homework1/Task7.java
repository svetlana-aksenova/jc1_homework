package homework1;

import static java.lang.Math.sqrt;

public class Task7 {
    public static void main(String[] args) {
        int a, b, r;
        a = 4;
        b = 6;
        r = 5;
        double radius;

        radius = (sqrt(a * a + b * b)) / 2;
        System.out.println(radius);

        if (radius >= r) {
            System.out.println("Отверстие можно полностью закрыть");
        } else
            System.out.println("Отверстие нельзя полностью закрыть");
    }


}
