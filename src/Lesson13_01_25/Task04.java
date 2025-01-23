package Lesson13_01_25;
//разворачиваем массив
import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int[]newArray=new int[array.length];
        for (int i = 0; i < array.length ; i++) {
            newArray[i]=array[array.length-1-i];
        }
        System.out.println(Arrays.toString(newArray));
    }
}
