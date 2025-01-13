package HomeWorkBook;
//подсчет положительных отрицательных и нулей

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 1; i <= 10; i++) {
            int value = scanner.nextInt();
            if (value < 0) {
                negative++;
            }
            if (value > 0) {
                positive++;
            } else if (value == 0) {
                zero++;
            }
        }
        System.out.println("Положительных " + positive);
        System.out.println("Отрицательных " + negative);
        System.out.println("Нулей " + zero);
    }
}
