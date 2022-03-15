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

        System.out.println(l + "!= " + calculateFactjrial(l));
        System.out.println(a + "!= " + calculateFactjrial(a));
        System.out.println(b + "!= " + calculateFactjrial(b));
        System.out.println(c + "!= " + calculateFactjrial(c));
        System.out.println(d + "!= " + calculateFactjrial(d));
        System.out.println(e + "!= " + calculateFactjrial(e));
        System.out.println(f + "!= " + calculateFactjrial(f));
        System.out.println(g + "!= " + calculateFactjrial(g));
        System.out.println(h + "!= " + calculateFactjrial(h));
        System.out.println(j + "!= " + calculateFactjrial(j));
        System.out.println(k + "!= " + calculateFactjrial(k));

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
