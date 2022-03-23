package homework3.task24;

public class Main {
    public static void main(String[] args) {
        Time my1 = new Time(120);
        Time my2 = new Time(2, 2, 0);

        System.out.println(my2.getTotalSecond());
        System.out.println(my1.getTotalSecond());
        System.out.println(my1.compareTime(my2));
        System.out.println(my1.outputData());
        System.out.println(my2.outputData());

        System.out.println(my2.compareTime(my1));


    }
}
