package homework5.task33;

public class PersonalizedCard extends NonPersonalizedCard implements CreditCard {

    protected String name;

    public PersonalizedCard() {

    }

    public PersonalizedCard(long cardNumber, long accountNumber, String paymentSystem, String validThru,
                            int cvvCod, String name) {
        super(cardNumber, accountNumber, paymentSystem, validThru, cvvCod);
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
