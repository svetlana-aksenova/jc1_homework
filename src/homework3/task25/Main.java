package homework3.task25;

public class Main {

    public static void main(String[] args) {

        Atm myAtm = new Atm(40, 10, 5);

        System.out.println(myAtm.getTotal());
        System.out.println(myAtm.withdrawMoney());
        System.out.println(myAtm.getTotal());
        System.out.println(myAtm.withdrawMoney());
        System.out.println(myAtm.getTotal());
    }
}
