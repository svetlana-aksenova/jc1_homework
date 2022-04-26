package homework7.task54;

import static homework7.task53.GenerateArray.createArray;
import static homework7.task54.TreadFile.enterPath;

public class Main {
    public static void main(String[] args) {

        String path = enterPath();
        for (int i = 0; i < 5; i++) {
            new TreadFile("Tread " + i, createArray(), path + "\\Tread" + i);
        }

    }
}
