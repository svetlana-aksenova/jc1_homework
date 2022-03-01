package homework1;

import java.util.ArrayList;
import java.util.List;

public class Task11 {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(getSchedule(a));

    }
    public static List<String>  getSchedule (int b) {
        List<String> result = new ArrayList<>();
        switch (b) {
            case 1 :
                result.add("Понедельник\n");
                result.add("1. Русский язык\n");
                result.add("2. Белорусский язык\n");
                result.add("3. Математика\n");
                result.add("4. Трудовое обучение");
                break;
            case 2:
                result.add("Вторник\n");
                result.add("1. Белорусская литература\n");
                result.add("2. Математика\n");
                result.add("3. Физическая культура\n");
                result.add("4. Английский язык\n");
                result.add("5. Основы безопасности жизнедеятельности");
                break;
            case 3:
                result.add("Среда\n");
                result.add("1. Музыка\n");
                result.add("2. Белорусский язык\n");
                result.add("3. Математика\n");
                result.add("4. Английский язык\n");
                result.add("5. Изобразительное искусство");
                break;
            case 4:
                result.add("Четверг\n");
                result.add("1. Русская литература\n");
                result.add("2. Русский язык\n");
                result.add("3. Математика\n");
                result.add("4. Час здоровья и спорта\n");
                result.add("5. Белорусская литература");
                break;
            case 5:
                result.add("Пятница\n");
                result.add("1. Человек и мир\n");
                result.add("2. Английский язык\n");
                result.add("3. Физическая культура\n");
                result.add("4. Белорусский язык\n");
                result.add("5. Русская литература");
                break;
            case 6:
                result.add("Суббота\n");
                result.add("Выходной");
                break;
            case 7:
                result.add("Воскресенье\n");
                result.add("Выходной");
                break;
            default:
                result.add("Дня с таким номером не существует");


        }
        return result;
    }
}
