package Lesson13_01_25;

//сумма элеменотов в массиве
public class Task01 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result+=array[i];
        }
        System.out.println(result);
    }



}

