package PaymentMethod;

public class Cash implements PaymentMethod {
    @Override
    public void pay(double amound) {
        System.out.println("Оплата наличными" + amound);

    }
}
