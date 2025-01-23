package HomeWork22;

import java.util.Arrays;

//3. Поиск второго максимального элемента
//Напишите метод, который находит второй по величине элемент в массиве. Используйте сортировку.
//
//Пример:
//Ввод: [10, 20, 30, 40, 50]
//Вывод: 40
public class Task02 {
    public static void main(String[] args) {
        int[] array = {12, 34, 55, 33, 44, 34, 12, 56, 34, 80};
        Arrays.sort(array);
        System.out.println(array[array.length-2]);
    }
}
