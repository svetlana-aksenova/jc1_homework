package homework5.task33;

public class NonPersonalizedCard extends Card {

    protected int cvvCod;

    public NonPersonalizedCard() {

    }

    public NonPersonalizedCard(long cardNumber, long accountNumber, String paymentSystem, String validThru,
                               int cvvCod) {
        super(cardNumber, accountNumber, paymentSystem, validThru);
        this.cvvCod = cvvCod;
    }

    public void setCvvCod(int cvvCod) {
        this.cvvCod = cvvCod;
    }

    public int getCvvCod() {
        return cvvCod;
    }
}
