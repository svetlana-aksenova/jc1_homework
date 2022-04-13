package homework6.Task42;

import java.util.HashMap;
import java.util.StringTokenizer;

import static homework6.Task42.TextString.*;

public class Main {

    public static void main(String[] args) {

        TextString text = new TextString();
        String str = text.toString();

        String[] words = stringToArray(str);
        HashMap<String, Integer> myMap = arrayToHashMap(words);
        System.out.println(myMap);

    }
}
