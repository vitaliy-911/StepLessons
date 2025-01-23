package Lesson13_01_25;
//соединяем 2 массива

import java.util.Arrays;

public class Task05 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10, 11, 12, 34};
        int[] arrayNew = new int[array1.length + array2.length];
        System.out.println(Arrays.toString(arrayNew));
        for (int i = 0; i < array1.length; i++) {
            arrayNew[i] = array1[i];
        }
        System.out.println(Arrays.toString(arrayNew));
        for (int i = 0; i < array2.length; i++) {
            arrayNew[i + array1.length] = array2[i];
        }
        System.out.println(Arrays.toString(arrayNew));
    }
}
