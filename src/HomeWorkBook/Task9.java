package HomeWorkBook;
//конвертер температур
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float temperature = scanner.nextFloat();
        System.out.println("Введите направление конверси : ");
        System.out.println("Фаренгейт в Цельсий  нажмите 1");
        System.out.println("Цельсий в Фаренгейт нажмите 2");
        char x = scanner.next().charAt(0);
        //float result;
        switch (x) {
            case '1':
                System.out.println( (temperature - 32) * 5 / 9);
                break;

            case '2':
                System.out.println( (temperature + 32) * 9 / 5);
                break;
        }

    }
}
