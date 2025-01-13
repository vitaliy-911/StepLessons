package HomeWorkBook;
//определение четверти по кординатам
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a < 0 && b > 0) {
            System.out.println("вторая четверть ");
        } else if (a > 0 && b > 0) {
            System.out.println("первая четверть ");
        } else if (a < 0 && b < 0) {
            System.out.println("третья четверть ");
        } else if (a > 0 && b < 0) {
            System.out.println("четвертая четверть");
        }
    }
}
