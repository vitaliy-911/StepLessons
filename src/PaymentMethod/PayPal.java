package PaymentMethod;

public class PayPal implements PaymentMethod {

    private final String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amound) {
        System.out.println(" оплата " + amound + " Через PL аккаунт " + email);
    }
}
