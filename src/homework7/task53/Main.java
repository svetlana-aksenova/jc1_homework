package homework7.task53;

import static homework7.task53.GenerateArray.createArray;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new ThreadArray("Tread " + i, createArray());
        }

    }
}
