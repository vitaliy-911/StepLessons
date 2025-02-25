package PaymentMethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PaymentMethod[] paymentMethods = new PaymentMethod[3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите способ оплаты 1 -наличные 2-картой 3-электронным кошельком");
        int value = scanner.nextInt();

        for (PaymentMethod paymentMethod : paymentMethods) {
            if (value == 1) {
                System.out.println("Введите сумму");
                paymentMethod = new Cash();
                paymentMethod.pay(scanner.nextDouble());
                break;
            }
            if (value == 2) {
                System.out.println("Введите сумму");
                paymentMethod = new CreditCard(1234567, "Иванов Иван");
                paymentMethod.pay(scanner.nextDouble());
                break;
            }
            if (value == 3) {
                System.out.println("Введите сумму");
                paymentMethod = new PayPal("kozlov@ramler.ru");
                paymentMethod.pay(scanner.nextDouble());
                break;
            }
        }
    }
}
