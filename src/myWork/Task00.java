package myWork;
//поиск индекс элемента
import java.lang.reflect.Array;

public class Task00 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 3, 4, 5, 6, 73, 4, 5};
        int index = -1;

        for (int i = 0; i < array.length ; i++) {
            if (array[i]==10){
                index=i;
                break;
            }
        }
        System.out.println(index);
    }
}
