package HomeWorkBook;
//описание введенного числа
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value > 0 && value < 10) {
            System.out.println("однозначное положительное");
        } else if (value < 0 && value > -10) {
            System.out.println("однозначное отрицательное");
        }
        if (value > 10 && value <= 99) {
            System.out.println("двузначное положительное");
        } else if (value < -10 && value >= -99) {
            System.out.println("двузначное отрицательное");
        }
        if (value > 99 && value <= 999) {
            System.out.println("трехзначное положительное ");
        } else if (value < -99 && value >= -999) {
            System.out.println("трехзначное отрицательное");

        }


    }
}
