package PaymentMethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PaymentMethod[] paymentMethods = new PaymentMethod[5];
        paymentMethods[0] = new Cash();
        paymentMethods[1] = new CreditCard(1234567, "Иванов Иван");
        paymentMethods [2] = new PayPal("kozlov@ramler.ru");



    }
}
