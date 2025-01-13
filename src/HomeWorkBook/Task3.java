package HomeWorkBook;
//калькулятор

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int one = scanner.nextInt();
        System.out.println("Выберете действие");
        char x = scanner.next().charAt(0);
        System.out.println("Введите второе число");
        int two = scanner.nextInt();

        int res;
        switch (x) {
            case '+':
                res = one + two;
                System.out.println(res);
                break;
            case '-':
                res = one - two;
                System.out.println(res);
                break;
            case '*':
                res = one * two;
                System.out.println(res);
                break;
            case '/':
                if (two == 0) {
                    System.out.println("на нуль делить нельзя");
                } else {
                    res = one / two;
                    System.out.println(res);
                    break;
                }
        }
    }
}
