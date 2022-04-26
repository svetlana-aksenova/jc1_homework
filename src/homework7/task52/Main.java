package homework7.task52;

import static homework7.task50.FileFolder.fillArrayList;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new ThreadAverage("Tread " + i, fillArrayList(10));
        }

    }
}
