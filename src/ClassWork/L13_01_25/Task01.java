package ClassWork.L13_01_25;

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int length = array.length;
        System.out.println(length);

        int a = array[5];

        for (int i = 0; i < length; i++) {
            array[i] = i * 13;
        }
        System.out.println(Arrays.toString(array));

        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2};
        System.out.println(Arrays.toString(array2));
        System.out.println(array2[3]);

        int[] array3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        array3[2] = 32;
        System.out.println(Arrays.toString(array3));

        char[] chars = new char[]{'a','f','g'};
        System.out.println(Arrays.toString(chars));

        for (int i = 0; i < chars.length ; i++) {
            System.out.println(chars[i]);
        }

        for (char aChar:chars){
            System.out.print(aChar);
        }

    }
}
