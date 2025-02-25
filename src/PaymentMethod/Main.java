package PaymentMethod;

public class Main {
    public static void main(String[] args) {
        PaymentMethod[] paymentMethods = new PaymentMethod[3];
        paymentMethods[0] = new Cash();
        paymentMethods[1] = new CreditCard(1234567,"Иванов Иван");
        paymentMethods[2] = new PayPal("kozlov@ramler.ru");

        for (PaymentMethod paymentMethod : paymentMethods) {
            paymentMethod.pay(250);
        }
    }
}
