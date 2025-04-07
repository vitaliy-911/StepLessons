package HomeWork.PaymentMethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите способ оплаты");
        int value = scanner.nextInt();

        if (value == 1) {
            System.out.println("Введите сумму");
            Cash cash = new Cash();
            cash.pay(scanner.nextDouble());
        }
        if (value == 2) {
            System.out.println("Введите сумму");
            CreditCard creditCard = new CreditCard(1234567, "Иванов Иван");
            creditCard.pay(scanner.nextDouble());
        }
        if (value == 3) {
            System.out.println("Введите сумму");
            PayPal payPal = new PayPal("kozlov@ramler.ru");
            payPal.pay(scanner.nextDouble());
        }
    }
}

