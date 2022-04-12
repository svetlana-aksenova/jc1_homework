package homework5.task38;

public class Motorcycle extends Vehicle implements Moveable {

    public Motorcycle(String name, String number) {
        super(name, number);
    }

    @Override
    public void move() {
        System.out.println("Motorcycle is mooving");
    }
}
