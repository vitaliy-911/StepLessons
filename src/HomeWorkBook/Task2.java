package HomeWorkBook;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value > 90) {
            System.out.println("Отлично");
        }
        if (value >= 75 && value <= 90) {
            System.out.println("Хорошо");
        }
        if (value >= 50 && value < 75) {
            System.out.println("Удовлетворительно");
        }
        if (value < 50) {
            System.out.println("Неудовлетворительно");
        }
    }
}
