package Lesson13_01_25;

//дано число в массиве найти его индекс и вывести в консоль если его нет вывести -1
public class Task03 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 4, 7, 6, 8, 9, 4, 0};
        int value = 8;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]==value){
                System.out.println(i);
            }
            System.out.println("-1");
        }

    }
}
