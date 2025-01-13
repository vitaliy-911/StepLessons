package HomeWorkBook;

import java.util.Scanner;

//подсчет положительных
public class Task17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        int positive = 0;

        if (one > 0) {
            positive++;
        }
        if (two > 0) {
            positive++;
        }
        if (three > 0) {
            positive++;
        }

        System.out.println("Положительных " + positive);
    }
}
