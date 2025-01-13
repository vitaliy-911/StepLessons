package HomeWorkBook;
//сравнение трех чисел и вывод среднего
import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one = 3;
        int two = 1;
        int three = 3;
        if (one < two && two < three) {
            System.out.println(two);
        } else if (two < three && three > one) {
            System.out.println(one);

        } else {
            System.out.println(three);
        }
    }
}
