package homework4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String s1 = enterString(); //Task 26
        Pattern p = Pattern.compile("[\\.,:;\\-!?()\"]");
        System.out.println("Задание 26. Всего знаков препинания: " + countPattern(s1, p));

        String s2 = enterString(); //Task 27
        Pattern p2 = Pattern.compile("\\s*\\(?\"?[А-Яа-яЁёA-Za-z0-9]+\\)?[\\.,:;\\?!)\"]?\\s*");
        System.out.println("Задание 27. Всего слов: " + countPattern(s2, p2));

        String s3 = enterString(); //Task 28
        s3 = s3.trim();
        String str = s3.replaceAll("[^А-Я^а-я^Ё^ё^\\s^A-Z^a-z]", "");
        String[] array = str.split(" +");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            char c = array[i].charAt(array[i].length() - 1);
            sb = sb.append(c);
        }
        System.out.println("Task 28. Текст, составленный из последних букв слов: " + sb);

        String s4 = enterString(); //Task29
        StringBuilder sb4 = findHex(s4);
        System.out.println("Задание 29. Шестнадцатиричные числа: " + sb4);

        String s5 = enterString();


    }

    public static String enterString() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }

    public static int countPattern(String s, Pattern p) {
        int count = 0;
        Matcher m = p.matcher(s);
        while (m.find()) {
            count++;
        }
        return count;
    }

    public static StringBuilder findHex(String s) {
        StringBuilder sb = new StringBuilder();
        Pattern p = Pattern.compile("\\b0x[0-9a-fA-F]+\\b");
        Matcher m = p.matcher(s);
        while (m.find()) {
            sb = sb.append(m.group() + " ");
        }
        return sb;

    }


}
