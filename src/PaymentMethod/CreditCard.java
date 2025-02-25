package PaymentMethod;

public class CreditCard implements PaymentMethod {

    private String cardHolder;
    private int cardNumber;

    public CreditCard(int cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void pay(double amound) {
        System.out.println(" Оплата " + amound + " c кредитной карты номер : " + cardNumber + " " + cardHolder);
    }
}
