package myWork;

import java.util.Arrays;
//копирование массива
public class Task01 {
    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6,7,8,9,10};
        int []newArray=new int[array.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        System.out.println(Arrays.toString(newArray));
    }


}
