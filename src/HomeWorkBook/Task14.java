package HomeWorkBook;

import java.util.Scanner;

//правило треугольника
public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 число : ");
        int a = scanner.nextInt();
        System.out.println("Введите 2 число : ");
        int b = scanner.nextInt();
        System.out.println("Введите 3 число : ");
        int c = scanner.nextInt();
        if (a+b<c||b+c<a||a+c<b){
            System.out.println("Треугольник не существует");
        }else {
            System.out.println("Треугольник  существует");
        }


    }
}
