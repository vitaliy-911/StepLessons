package HomeWork;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = 5;
        int res = 0;
        for (int i = value; i > 0; i--) {
            if (value % 2 != 0) {
                break;
            }
            if (i % 2 == 0) {
                res += i * i;
            } else {
                res -= i * i;
            }

        }
        for (int i = value; i > 0; i--) {
            if (value % 2 == 0) {
                break;
            }
            if (i % 2 != 0) {
                res += i * i;
            } else {
                res -= i * i;
            }

        }
        System.out.println(res);

    }
}
