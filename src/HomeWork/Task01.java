package HomeWork;

//таблица умножения по пифагор
public class Task01 {
    public static void main(String[] args) {
        for (int a = 1; a <= 10; a++) {
            System.out.print(a + "\t");
        }
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            int res;
            for (int j = 1; j <= 10; j++) {
                res = i * j;
                System.out.print(res + "\t");
                if (j == 10) {
                    System.out.println();
                }
            }
        }
    }
}
