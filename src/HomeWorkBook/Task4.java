package HomeWorkBook;
//факториал
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число : ");
        int value = scanner.nextInt();
        int result=value;
        for (int i = 1; i < value; i++) {
            result = result * i;
        }
        System.out.println(result);
    }
}
