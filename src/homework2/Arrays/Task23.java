package homework2.Arrays;

public class Task23 {
    public static void main(String[] args) {

        // 1-й способ
        int[][] m = new int[5][5];

        int b = m.length;
        int c = 0;
        for (int i = 0; i < m[i].length / 2 + 1; i++) {
            for (int j = c; j < b; j++) {
                m[i][j] = 1;
            }
            c++;
            b--;
        }

        b = m.length;
        c = 0;

        for (int i = m.length - 1; i >= m.length / 2; i--) {
            for (int j = c; j < b; j++) {
                m[i][j] = 1;
            }
            c++;
            b--;
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();

        }

        System.out.println();

        // 2-й способ
        int[][] arr = new int[5][5];
        int i, j;
        for (i = 0; i < arr.length / 2 + 1; i++) {
            for (j = 0; j < arr[i].length; j++) {
                if (j < i || j >= arr[i].length - i) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = 1;
                }
            }
        }

        for (i = arr.length - 1; i > arr.length / 2; i--) {
            for (j = 0; j < arr[i].length; j++) {
                if (j < arr[i].length - i - 1 || j > i) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = 1;
                }
            }
        }


        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
