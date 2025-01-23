package myWork;

//сумма элементов в массиве
public class Task02 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 2};
        int sum=0;
        for (int i = 0; i < array.length ; i++) {
            sum+=array[i];
        }
        System.out.println(sum);
    }
}
