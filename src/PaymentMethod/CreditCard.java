package PaymentMethod;

public class CreditCard implements PaymentMethod {

    private int cardNumber;
    private String cardHolder;

    public CreditCard(int cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void pay(double amound) {
        System.out.println("Оплата" + amound + "c кредитной карты" + cardHolder);
    }
}
