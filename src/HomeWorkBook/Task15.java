package HomeWorkBook;
//высокосный не высокосный

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("Высокосный ");
        } else {
            System.out.println("не высокосный");
        }
    }
}
