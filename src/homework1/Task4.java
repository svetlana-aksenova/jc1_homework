package homework1;

public class Task4 {
    public static void main(String[] args) {

        int a = 16;
        int b = 38;
        int c = calculate(a, b);
        System.out.println(c);

    }

    public static int calculate(int x, int y) {
        int result = (x + y) + x * y;
        return result;
    }
}
