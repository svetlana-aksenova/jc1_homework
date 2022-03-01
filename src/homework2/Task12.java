package homework2;

public class Task12 {
    public static void main(String[] args) {

        int l = 0;
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int f = 6;
        int g = 7;
        int h = 8;
        int j = 9;
        int k = 10;

        System.out.println(calculateFactjrial(l));
        System.out.println(calculateFactjrial(a));
        System.out.println(calculateFactjrial(b));
        System.out.println(calculateFactjrial(c));
        System.out.println(calculateFactjrial(d));
        System.out.println(calculateFactjrial(e));
        System.out.println(calculateFactjrial(f));
        System.out.println(calculateFactjrial(g));
        System.out.println(calculateFactjrial(h));
        System.out.println(calculateFactjrial(j));
        System.out.println(calculateFactjrial(k));

    }

    public static int calculateFactjrial(int x) {
        if (x == 0) {
            return 1;
        } else {
            int result = 1;
            int i = 1;
            while (i <= x) {
                result = result * i;
                i++;
            }

            return result;
        }
    }
}
