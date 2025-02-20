package ClassWork.L23_12_24;

public class HomeWork {
    public static void main(String[] args) {
        int a = 30;
        int b = 31;
        int c = 32;
        int max = 0;

        if (a < b) {
            max = b;
        } else   {
            max=a;
        }
        if (max < c) {
            max = c;
        }
        System.out.println(max);

    }
}
