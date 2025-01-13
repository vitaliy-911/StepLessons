package HomeWork;
//пирамидки
public class Task03 {
    public static void main(String[] args) {
        int x = 6;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= x; j++) {
                System.out.print(j);
            }
            System.out.println();
            x--;
        }
        System.out.println("*********************");
        int z = 1;
        for (int v = 1; v <= 6; v++) {
            for (int c = 1; c <= z; c++) {
                System.out.print(c);
            }
            System.out.println();
            z++;
        }
    }
}
