package homework5.task38;

import static homework5.task38.Garage.enterCarName;
import static homework5.task38.Garage.enterCarNumber;

public class Main {

    public static void main(String[] args) {

        //Garage <Car> car1 = new Garage<Car>(enterCarName(), enterCarNumber());
        Garage<Car> car1 = new Garage<Car>();
        System.out.println(car1.getVehical());

    }

}
