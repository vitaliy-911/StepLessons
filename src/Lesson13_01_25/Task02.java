package Lesson13_01_25;
//подсчет четных чисел в массиве
public class Task02 {
    public static void main(String[] args) {
        int[]array={1,2,2,4,3,5,6,6,8,8,5,7};
        int result=0;
        for (int i = 0; i < array.length ; i++) {
            if(array[i]%2==0){
                result++;
            }
        }
        System.out.println(result);
    }
}
