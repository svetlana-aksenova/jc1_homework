package homework7.task48;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Number {

    public static int[] stringArrayToInt(String[] array) {
        int[] nums = new int[array.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(array[i]);
        }
        return nums;
    }

    public static int countSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static ArrayList<Integer> intArrayToList(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(Integer.valueOf(arr[i]));
        }
        return list;
    }

    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> list) {
        ArrayList<Integer> filteredList = list.stream().distinct().collect(Collectors.toCollection(ArrayList::new));
        return filteredList;
    }


}
