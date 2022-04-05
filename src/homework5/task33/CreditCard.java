package homework5.task33;

public interface CreditCard {

    default void payOnCredit() {
        System.out.println("Payment was made on credit");
    }

}
