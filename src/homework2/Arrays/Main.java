package homework2.Arrays;

import java.util.Random;


public class Main {
    public static void main(String[] args) {

        //Task18
        int[] array1 = new int[10];
        fillArray(array1);
        System.out.println("Task18. Последний элемент массива array1["
                + (array1.length - 1) + "] = " + array1[array1.length - 1]);

        // Task19
        int[] array2 = new int[10];
        fillArray(array2);
        System.out.println("Task19. Элементы стоящие на четных позициях:");
        for (int i = 0; i < array2.length; i++) {
            if (i % 2 == 0) {
                System.out.println("array[" + i + "] " + array2[i]);
            }
        }

        //Task20
        int[] array3 = new int[10];
        fillArray(array3);
        int max = findMaxValue(array3);
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] == max) {
                System.out.println("Task20. Индекс максимального элемента массива: " + i);
            }
        }

        //Task21
        int[] array4 = new int[10];
        fillArray(array4);
        int maxValue = findMaxValue(array4);
        int minValue = findMinValue(array4);

        int countMax = 0;
        int countMin = 0;


        for (int k : array4) {
            if (k == maxValue) {
                countMax++;
            }
            if (k == minValue) {
                countMin++;
            }
        }

        int option;
        if (countMax == 1 && countMin == 1) {
            option = 1;
        } else {
            option = 2;
        }

        switch (option) {
            case 1:
                int indexMax = 0;
                int indexMin = 0;
                long sum = 0;

                for (int j = 0; j < array4.length; j++) {
                    if (array4[j] == maxValue) {
                        indexMax = j;
                    } else {
                        if (array4[j] == minValue) {
                            indexMin = j;
                        }
                    }
                }
                if ((indexMax - indexMin) == 1 || (indexMin - indexMax) == 1) {
                    System.out.println("Task21. Минимальный и максимальный элементы идут друг за другом");
                } else {
                    if (indexMax > indexMin) {
                        for (int a = indexMin + 1; a < indexMax; a++) {
                            if (Long.MAX_VALUE - sum >= array4[a]) {
                                sum = sum + array4[a];
                            } else {
                                System.out.println("Task21. Error out of bound");
                                break;
                            }
                        }
                        System.out.println("Task21. Сумма элементов: " + sum);
                    } else {
                        for (int b = indexMax + 1; b < indexMin; b++) {
                            if (Long.MAX_VALUE - sum >= array4[b]) {
                                sum = sum + array4[b];
                            } else {
                                System.out.println("Task21. Error out of bound");
                                break;
                            }
                        }
                        System.out.println("Task21. Сумма элементов: " + sum);
                    }
                }
                break;

            case 2:
                int indexStart = 0;
                int indexEnd = 0;
                for (int c = 0; c < array4.length; c++) {
                    if (array4[c] == maxValue || array4[c] == minValue) {
                        indexStart = c;
                        break;
                    }
                }
                for (int d = array4.length - 1; d > 0; d--) {
                    if (array4[d] == maxValue || array4[d] == minValue) {
                        indexEnd = d;
                        break;
                    }
                }
                System.out.println("Task21. Максимальная разница индексов между минимумом и максимумом = " +
                        (indexEnd - indexStart - 1));
                break;


        }

        //Task22
        int[] array5 = new int[10];
        fillArray(array5);
        System.out.println("Task22. Исходный массив");

        for (int i = 0; i < array5.length; i++) {
            System.out.println(array5[i]);
        }

        int s = array5.length - 1;
        for (int i = 0; i < array5.length / 2; i++) {
            int buffer1 = array5[i];
            int buffer2 = array5[s];
            array5[i] = buffer2;
            array5[s] = buffer1;
            s--;
        }
        System.out.println("Перевернутый массив");

        for (int i = 0; i < array5.length; i++) {
            System.out.println(array5[i]);
        }


    }


    public static void fillArray(int[] array) {
        if (array == null || array.length == 0) System.out.println("Error");
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();

        }
    }

    public static int findMaxValue(int[] array) {
        if (array.length == 0) {
            return Integer.MAX_VALUE;
        } else {
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        }
    }

    public static int findMinValue(int[] array) {
        if (array.length == 0) {
            return Integer.MIN_VALUE;
        } else {
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            return min;
        }
    }


}