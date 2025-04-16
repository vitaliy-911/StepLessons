package HomeWork.PaymentMethod;

import java.util.Objects;

public class CreditCard implements PaymentMethod {

    private final String cardHolder;
    private final int cardNumber;

    public CreditCard(int cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return cardNumber == that.cardNumber && Objects.equals(cardHolder, that.cardHolder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardHolder, cardNumber);
    }

    @Override
    public void pay(double amound) {
        System.out.println(" Оплата " + amound + " c кредитной карты номер : " + cardNumber + " " + cardHolder);
    }
}
