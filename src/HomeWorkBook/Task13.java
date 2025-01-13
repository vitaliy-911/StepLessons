package HomeWorkBook;

import java.util.Scanner;

//светофор
public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();

        if (time % 10 == 4 || time % 10 == 8) {
            System.out.println(" желтый ");
        } else if (time % 10 == 5 || time % 10 == 9) {
            System.out.println(" красный ");
        } else {
            System.out.println("зеленый");
        }
    }
}
