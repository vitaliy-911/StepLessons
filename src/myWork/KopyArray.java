package myWork;

import java.util.Arrays;

public class KopyArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 5, 4, 7, 6, 7, 1, 9};
        int []array2=new int[array1.length];
        System.arraycopy(array1,0,array2,0,array2.length);

        System.out.println(Arrays.toString(array2));

    }

}
