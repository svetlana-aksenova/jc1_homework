package homework2;

public class Task14 {
    public static void main(String[] args) {

        long l = 7893823445L;

        long sum = 0;
        do {
            long a = l % 10;
            sum += a;
            l /= 10;
        }
        while (l > 0);

        System.out.println(sum);

    }
}
