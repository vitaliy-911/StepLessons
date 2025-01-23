package HomeWork22;

import java.util.Arrays;

//2. Сравнение массивов
//Напишите метод, который сравнивает два массива на равенство с использованием Arrays.equals().
//
//Пример:
//Массивы: [1, 2, 3] и [1, 2, 3]
//Результат: true
public class Task01 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int[] newArray = {1, 2, 3};
        boolean x = true;
        if (Arrays.equals(array, newArray)) {
            System.out.println(x);
        } else {
            x = false;
            System.out.println(x);
        }
    }
}
