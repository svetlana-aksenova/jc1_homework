package homework1;

public class Task8 {
    public static void main(String[] args) {
        int a = 7650;

        if ((a % 10) == 1) {
            System.out.println(a + " рубль");
        } else if ((a % 10) > 1 && (a % 10) < 5) {
            System.out.println(a + " рубля");
        } else {
            System.out.println(a + " рублей");
        }
    }
}
