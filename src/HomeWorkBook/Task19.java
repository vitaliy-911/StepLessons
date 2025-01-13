package HomeWorkBook;

import java.util.Scanner;

//рисуем прямоугольник
public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите ширину");
        int width = scanner.nextInt();
        System.out.println("введите высоту");
        int height = scanner.nextInt();
        for (int i = 0; i < height; i++) {
            System.out.println(" ");
            for (int j = 0; j < width; j++) {
                System.out.print("8");

            }

        }


    }
}

