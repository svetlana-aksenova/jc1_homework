package homework7.task51;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Generator {

    private static String[] nameArray = {"Анна", "Ольга", "Кристина", "Мария", "Ирина",
            "Александр", "Дмитрий", "Владимир", "Петр", "Василий", "Галина", "Елена",
            "Марина", "Наталья", "Алла", "Артем", "Артур", "Максим", "Егор", "Антон"};
    private static String[] surnameArray = {"Смалюк", "Лис", "Русинович", "Ильяшук", "Козачек", "Вабищевич",
            "Баранчик", "Купач", "Коваль", "Жукович", "Русак", "Якимович", "Шимкевич", "Гилевич",
            "Бианки", "Барто", "Житко", "Коптик", "Климовец", "Яцура"};

    public static int getRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(19);
        return randomNumber;
    }

    public static int getRandomAge() {
        int randomNumber = (int) (Math.random() * 33 + 18);
        return randomNumber;
    }

    public static Person generatePerson() {
        String name = nameArray[getRandomNumber()];
        String surname = surnameArray[getRandomNumber()];
        int age = getRandomAge();
        return new Person(name, surname, age);
    }

    public static ArrayList<String> getArrayOfRandomPersons(int number) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            list.add(generatePerson().getPersonInfo());
        }
        return list;
    }

    public static int enterNumber() {
        System.out.println("Enter the required number of persons");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Enter number>0");
        }
        return number;

    }

}
