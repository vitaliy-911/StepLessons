package ClassWork.L20_01_25;

import utils.ArrayUtil;

import java.util.Arrays;

public class Task03BubbleSort {
    public static void main(String[] args) {
        int[] a = ArrayUtil.generateIntArray(10, 0, 10);
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}
