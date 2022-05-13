package homework7.task47;

import static homework7.task47.Count.countPunctuationMarks;
import static homework7.task47.Count.countWords;
import static homework7.task47.TextEntry.enterPath;

public class Main {

    public static void main(String[] args) {

        String path = enterPath();
        TextEntry textEntry = new TextEntry(path);
        textEntry.writeText();

        TextReading textReading = new TextReading(path);
        StringBuilder sb = textReading.readFile(path);

        String s = sb.toString();
        System.out.println("Total punctuation in file: " + countPunctuationMarks(s));
        System.out.println("Total words in file: " + countWords(s));
    }
}
