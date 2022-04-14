package homework6.Task43;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Smith");
        try {
            int phone = person1.getNumber();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
