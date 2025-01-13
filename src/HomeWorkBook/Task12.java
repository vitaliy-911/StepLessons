package HomeWorkBook;
//нахождение наибольшего из четырех

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 число : ");
        int one = scanner.nextInt();
        System.out.println("Введите 2 число : ");
        int two = scanner.nextInt();
        System.out.println("Введите 3 число : ");
        int three = scanner.nextInt();
        System.out.println("Введите 4 число : ");
        int four = scanner.nextInt();
        int maxValue1;
        int maxValue2;

        if (one < two) {
            maxValue1 = two;
        } else {
            maxValue1 = one;
        }
        if (three < four) {
            maxValue2 = four;
        } else {
            maxValue2 = three;
        }
        if (maxValue1 < maxValue2) {
            System.out.println(maxValue2);
        } else {
            System.out.println(maxValue1);
        }


    }
}
