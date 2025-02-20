package ClassWork.L23_12_24;

import java.util.Scanner;

/*Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
        «отрицательное четное число» - если число отрицательное и четное,
        «отрицательное нечетное число» - если число отрицательное и нечетное,
        «ноль» - если число равно 0,
        «положительное четное число» - если число положительное и четное,
        «положительное нечетное число» - если число положительное и нечетное.
Пример для числа 100:
положительное четное число
Пример для числа -51:
отрицательное нечетное число*/
public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        int value = scanner.nextInt();
        if (value < 0 && value % 2 == 0) {
            System.out.println("отрицательное четное число");
        } else if (value < 0 && value % 2 != 0) {
            System.out.println("отрицательное нечетное число");
        } else if (value > 0 && value % 2 == 0) {
            System.out.println("положительное четное число");
        } else if (value > 0 && value % 2 != 0) {
            System.out.println("положительное нечетное число");
        } else {
            System.out.println("ноль");
        }


    }
}
