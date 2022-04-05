package homework5.task33;

public abstract class Card {

    long cardNumber;
    long accountNumber;
    String paymentSystem;
    String validThru;

    public Card() {

    }

    public Card(long cardNumber, long accountNumber, String paymentSystem, String validThru) {
        this.cardNumber = cardNumber;
        this.accountNumber = accountNumber;
        this.paymentSystem = paymentSystem;
        this.validThru = validThru;

    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setPaymentSystem(String paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public void setValidThru(String validThru) {
        this.validThru = validThru;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getPaymentSystem() {
        return paymentSystem;
    }

    public String getValidThru() {
        return validThru;
    }

    public void pay() {
        System.out.println("Purchase payment");

    }


}
