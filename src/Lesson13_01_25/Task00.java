package Lesson13_01_25;

public class Task00 {
    public static void main(String[] args) {
        int[] array = {1, 23, 44, 54, 34, 18};
        int value=Integer.MIN_VALUE;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]>value) {
                value=array[i];
            }
        }
        System.out.println(value);
    }
}
