package ClassWork.L23_12_24;

import java.util.Scanner;

//switch case
public class Task00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
      //  int b = sc.nextInt();
        System.out.println("выводим переменную " + a);
        // System.out.println("выводим переменную " + b);
        switch (a) {
            case 1:
                System.out.println("еременная a=oдин");
                break;
            case 2:
                System.out.println("еременная a=два");
                break;
            case 3:
                System.out.println("еременная a=три");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("переменная или 4 или 5 или 6");
            default:
                System.out.println("не одно из условий не работает");
        }
    }
}
