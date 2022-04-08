package homework5.task33;

public class ChildrenCard extends PersonalizedCard {

    protected ChildrenCard() {

    }

    public ChildrenCard(long cardNumber, long accountNumber, String paymentSystem, String validThru,
                        int cvvCod, String name) {
        super(cardNumber, accountNumber, paymentSystem, validThru, cvvCod, name);
    }

    @Override
    public final void payOnCredit() {
        System.out.println("The child cannot make purchases on credit");
    }

    @Override
    public void pay() {
        System.out.println("The child can spend a maximum of $15 per day");
    }

}
