package homework2;


public class Task14 {
    public static void main(String[] args) {

        long l = 7893823445L;

        long sum = 0;
        do {
            long a = l%10;
            sum += a;
            l/=10;
        }
        while(l>0);

        System.out.println(sum);


        int i, j;
        boolean isprime;
        for(i=50; i < 71; i++) {
            isprime = true;
            // проверить, делится ли число без остатка
            for (j=2; j <= i/j; j++)
                // если число делится без остатка, значит, оно не простое
                if((i%j) == 0) isprime = false;
            if (isprime)
                System.out.println(i + " - простое число.");
        }








    }
}
