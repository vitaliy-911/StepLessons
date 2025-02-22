package ClassWork.L24_09_25;

import java.util.Scanner;

public class Task00 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        while (i > 5) {
            if (i == 7) {
                System.out.println(" мы не будем выполнять блок кода ниже");
                continue;
            }

            if (i == 6) {
                System.out.println("i=6 прекращаем цикл");
                break;

            }
            System.out.println(i);
            i--;
        }
    }
}

