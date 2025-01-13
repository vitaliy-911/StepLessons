package HomeWorkBook;
//сумма чисел от 1 и до ....
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число : ");
        int value = scanner.nextInt();
        int res = 0;
        for (int i = 1; i < value; i++) {

            res = res + i;

        }
        System.out.println(res);
    }
}
