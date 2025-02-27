package PaymentMethod;


public class Main {

    public static void main(String[] args) {
        PaymentMethod[] paymentMethods = new PaymentMethod[5];
        paymentMethods[0] = new Cash();
        paymentMethods[1] = new CreditCard(1234567, "Иванов Иван");
        paymentMethods[2] = new PayPal("kozlov@ramler.ru");
        paymentMethods[3] = new CreditCard(1234567, "Иванов Иван");


        CreditCard creditCard = new CreditCard(1234, "river");
        CreditCard creditCard1 = new CreditCard(1234, "river");

        System.out.println(creditCard1.equals(creditCard));
        System.out.println(creditCard == creditCard1);

    }
}
