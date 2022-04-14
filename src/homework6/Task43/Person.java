package homework6.Task43;

public class Person {

    private final String name;
    private Integer number;
    private Integer age;

    public Person(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }


}
