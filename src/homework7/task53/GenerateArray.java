package homework7.task53;

import java.util.Random;

public class GenerateArray {

    public static int[] createArray() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandom();
        }
        return array;
    }

    public static int getRandom() {
        Random random = new Random();
        int a = random.nextInt(100);
        return a;
    }


    public static int findMaxElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
