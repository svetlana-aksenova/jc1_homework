package homework1;

public class task6 {
    public static void main(String[] args) {
        int a = 237;
        boolean d = define(a);
        System.out.println(d);

    }

    public static boolean define(int b) {
        boolean c;
        if (b % 10 == 7) {
            c = true;
        } else {
            c = false;
        }
        return c;

    }
}
