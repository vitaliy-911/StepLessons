package ClassWork.L16_01_25;

public class Task03 {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 1, 1, 1, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[i + 1]) {
                System.out.println("no");
                break;
            }
            System.out.println("yes");
        }

    }
}
