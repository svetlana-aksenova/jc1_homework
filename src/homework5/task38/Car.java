package homework5.task38;

public class Car extends Vehicle implements Moveable {


    public Car(String name, String number) {
        super(name, number);
    }

    @Override
    public void move() {
        System.out.println("Car is mooving");
    }


}
