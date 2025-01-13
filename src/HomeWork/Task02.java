package HomeWork;
//вычисление стипендии
import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        int four = scanner.nextInt();
        int res = one + two + three + four;
        int lowMarkCounter = 0;
        int socStep = 35;
        int defStep = 55;
        int kef = defStep - socStep;

        if (one < 4) {
            lowMarkCounter += 1;
        }
        if (two < 4) {
            lowMarkCounter += 1;
        }
        if (three < 4) {
            lowMarkCounter += 1;
        }
        if (four < 4) {
            lowMarkCounter += 1;
        }
        if (lowMarkCounter > 2) {
            System.out.println("отчислен");
        }
        if (lowMarkCounter == 1 || lowMarkCounter == 2) {
            System.out.println("задолженость");
        }
        if (lowMarkCounter == 0) {
            float gradePoint = (float) res / 4;
            System.out.println("средний бал " + gradePoint);

            if (gradePoint <= 5) {
                System.out.println(socStep);
            }
            if (gradePoint > 5 && gradePoint < 7) {
                System.out.println(defStep);
            }
            if (gradePoint > 7 && gradePoint < 9) {
                System.out.println(defStep + kef);
            }
            if (gradePoint > 9 && gradePoint < 10) {
                System.out.println(defStep + kef * 2);
            }
        }
    }
}

