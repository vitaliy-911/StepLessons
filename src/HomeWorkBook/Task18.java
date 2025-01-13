package HomeWorkBook;
//подсчет положительных и отрицательных чисел
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        int positive = 0;
        int negative = 0;
        if (one < 0) {
            negative++;
        } else if (one > 0) {
            positive++;
        }
        if (two < 0) {
            negative++;
        } else if (two > 0) {
            positive++;
        }
        if (three < 0) {
            negative++;
        } else if (three > 0) {
            positive++;
        }
        System.out.println("положительных чисел :" + positive);
        System.out.println("Отрицательных чисел :" + negative);


    }
}
