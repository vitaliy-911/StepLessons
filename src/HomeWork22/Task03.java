package HomeWork22;

import java.util.Arrays;

//4. Слияние двух отсортированных массивов
//Напишите метод, который принимает два отсортированных массива и возвращает
// новый массив, содержащий элементы из обоих массивов, также отсортированный.
//Пример:
//Массивы: [1, 3, 5] и [2, 4, 6]
//Результат: [1, 2, 3, 4, 5, 6]
public class Task03 {
    public static void main(String[] args) {
        int[] arr1 = {23, 45, 233, 56, 76};
        int[] arr2 = {21, 33, 45, 67, 88, 97};
        int[] newArr = new int[arr1.length + arr2.length];

        sortArray(arr1);
        sortArray(arr2);
        glueAnArray(arr1, arr2, newArr);
        System.out.println(Arrays.toString(newArr));
    }

    public static int[] sortArray(int[] array) {
        Arrays.sort(array);
        return (array);
    }

    public static int[] glueAnArray(int[] arr1, int[] arr2, int[] newArray) {
        int val = 0;
        for (int i = 0; i < arr1.length; i++) {
            newArray[i] = arr1[i];
            val++;
        }
        for (int i = 0; i < arr2.length; i++) {
            newArray[val++] = arr2[i];
        }
        sortArray(newArray);
        return newArray;
    }
}
