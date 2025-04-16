package HomeWork.HomeWork22;

import java.util.Arrays;

//Копирует первый массив в новый массив (используйте Arrays.copyOf).
//Копирует часть массива (например, первые 3 элемента).
//Пример:
//Ввод: [1, 2, 3, 4, 5]
//Результат: [1, 2, 3]
public class Task00 {
    public static void main(String[] args) {
        int []array={1,2,3,4,5};
        int[]newArray=Arrays.copyOf(array,3);
        System.out.println(Arrays.toString(newArray));

    }
}
