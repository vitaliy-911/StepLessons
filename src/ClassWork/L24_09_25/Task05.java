package ClassWork.L24_09_25;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result =0;
        for ( ; ; ) {
            int value = scanner.nextInt();
            if (value == 10) {
                break;
            }
            result++;
        }
        System.out.println(result);
    }
}
