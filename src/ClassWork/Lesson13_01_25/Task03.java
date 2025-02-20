package ClassWork.Lesson13_01_25;

//дано число в массиве найти его индекс и вывести в консоль если его нет вывести -1
public class Task03 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 4, 7, 3, 8, 9, 4, 0};
        int value = 9;
        int idx = -1;
        for (int i = 0; i < array.length; i++) {

            if (array[i] == value) {
                idx = i;
                break;
            }
        }
        System.out.println(idx);
    }
}
