package homework6.task42;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class TextString {

    private final String textString;

    public TextString() {
        Scanner scanner = new Scanner(System.in);
        this.textString = scanner.nextLine();
    }

    @Override
    public String toString() {
        return textString.trim();
    }

    public static void removePunctuationMarks(String s) {
        //TODO: you can remove punctuation marks if needed
    }

    public static String[] stringToArray(String str) {
        String s = str.toLowerCase(Locale.ROOT);
        String[] array = s.split("\\s");
        return array;
    }

    public static HashMap<String, Integer> arrayToHashMap(String[] arr) {
        HashMap<String, Integer> keyValue = new HashMap<String, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (keyValue.containsKey(arr[i])) {
                int counter = keyValue.get(arr[i]);
                keyValue.put(arr[i], counter + 1);
            } else {
                keyValue.put(arr[i], 1);
            }

        }
        return keyValue;
    }
}
