package Lesson13_01_25;

import java.util.Arrays;

//Удаление элемента из массива
//Дано: массив и индекс элемента для удаления. Создайте новый массив без указанного элемента и выведите его.
public class Task06 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //             0, 1, 2, 3. 4.5.6.7.8

        int[] newArray = new int[array.length - 1];
        int index = 1;//это число 2 по индексу


        for (int i = 0, j = 0; i < array.length; i++) {

            if (i == index) {
                continue;
            }
            newArray[j++] = array[i];
        }
        System.out.println(Arrays.toString(newArray));
    }
}
