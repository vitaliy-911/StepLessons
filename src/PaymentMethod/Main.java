package PaymentMethod;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PaymentMethod[] paymentMethods = new PaymentMethod[5];
        paymentMethods[0] = new Cash();
        paymentMethods[1] = new CreditCard(1234567, "Иванов Иван");
        paymentMethods[2] = new PayPal("kozlov@ramler.ru");
        paymentMethods[3] = new CreditCard(1234567, "Иванов Иван");


        CreditCard creditCard = new CreditCard(1234, "river");
        CreditCard creditCard1 = new CreditCard(1234, "river");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите способ оплаты");
        int value = scanner.nextInt();

        System.out.println(creditCard1.equals(creditCard));
        System.out.println(creditCard == creditCard1);

        if (value == 1) {
            System.out.println("Введите сумму");
            Cash cash = new Cash();
            cash.pay(scanner.nextDouble());
        }
        if (value == 2) {
            System.out.println("Введите сумму");
            CreditCard creditCard3 = new CreditCard(1234567, "Иванов Иван");
            creditCard.pay(scanner.nextDouble());
        }
        if (value == 3) {
            System.out.println("Введите сумму");
            PayPal payPal = new PayPal("kozlov@ramler.ru");
            payPal.pay(scanner.nextDouble());
        }
    }
}

