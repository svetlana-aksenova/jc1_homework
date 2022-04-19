package homework7.task47;

import static homework7.task47.Count.countPunctuatioMarks;
import static homework7.task47.Count.countWords;
import static homework7.task47.TextEntry.enterPath;
import static homework7.task47.TextEntry.enterText;

public class Main {

    public static void main(String[] args) {

        String path = enterPath();
        //String text = enterText();
        //TextEntry textEntry = new TextEntry(path);
        // textEntry.writeText(text);

        TextReading textReading = new TextReading(path);
        String s = textReading.readFile(path);
        System.out.println(s);

        System.out.println("Total punctuation in file: " + countPunctuatioMarks(s));
        System.out.println("Total words in file: " + countWords(s));


    }
}
