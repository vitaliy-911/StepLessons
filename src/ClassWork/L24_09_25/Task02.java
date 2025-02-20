package ClassWork.L24_09_25;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("введите число");
        while (true) {
            num = scanner.nextInt();
            System.out.println("вы ввели " + num);
            if (num == 0) {
                System.out.println("завершаю");
                break;
            }
        }



    }
}
