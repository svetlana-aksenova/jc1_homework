package homework7.task47;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Count {

    static int countPunctuatioMarks(String s) {
        int count = 0;
        Pattern p = Pattern.compile("[\\.,:;\\-!?()\"]");
        Matcher m = p.matcher(s);
        while (m.find()) {
            count++;
        }
        return count;
    }

    static int countWords(String s) {
        int count = 0;
        Pattern p = Pattern.compile("\\s*\\(?\"?[А-Яа-яЁёA-Za-z0-9]+\\)?[\\.,:;\\?!)\"]?\\s*");
        Matcher m = p.matcher(s);
        while (m.find()) {
            count++;
        }
        return count;
    }

}