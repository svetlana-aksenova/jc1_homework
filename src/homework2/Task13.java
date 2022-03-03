package homework2;

import java.math.BigInteger;

import static java.math.BigInteger.*;

public class Task13 {
    public static void main(String[] args) {

        int i= 1; //counter

        BigInteger x = valueOf(1);
        BigInteger result = valueOf(1);

        do {
            result = result.multiply(x);
            x= (x.add(valueOf(1))); //numbers from 1 to 25
            i++;

        }
        while (i<=25);
        System.out.printf("%,d",result);

    }




}
