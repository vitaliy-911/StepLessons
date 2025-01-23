package Lesson13_01_25;

//Задача вывести сколько раз встречается цифры в массиве.
//1 - 2 раза
//2 - 3 раза
//3 - 1 раз
//4 - 1 раз
//5 - 4 раза
public class Task08 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1, 1,};
        int result = 0;

        for (int j = 1; j < array.length; j++) {
            for (int i = 0; i < array.length; i++) {
                if (j == array[i]) {
                    result++;
                }
            }
            System.out.println(j + " повторяется " + result + " раз ");
            result = 0;
        }
    }
}
