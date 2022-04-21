package homework7.task48;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {

    public static StringBuilder deleteWords(String s) {
        StringBuilder sb = new StringBuilder();
        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(s);
        while (m.find()) {
            sb.append(m.group());
            sb.append(" ");
        }
        return sb;
    }

    public static String stringBuilderToString(StringBuilder sb) {
        String s = sb.toString();
        return s;
    }

    public static String[] textToArray(String s) {
        String[] array = s.split(" ");
        return array;
    }


}
