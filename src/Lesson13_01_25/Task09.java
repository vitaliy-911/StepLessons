package Lesson13_01_25;

//Подсчитать количество пар с заданной суммой
//Условие: Найдите количество пар в массиве, сумма которых равна заданному числу k.
public class Task09 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 1, 4, 2, 5, 7};
        int result = 0;
        int value = 4;

        for (int i = 0; i < array.length; i++) {
            int zerro = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (zerro + array[j] == value) {
                    result++;
                    System.out.println(zerro + "," + array[j]);
                }
            }
        }
        System.out.println(result + " пары ");
    }
}
