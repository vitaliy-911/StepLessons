package myWork;

public class Function {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 4, 7, 8, 9, 4, 5, 8};
        short num = 7;
        int result = summa((short) 5, num);
        info(String.valueOf(result));
        int summ1 = summaArray(nums1);
        System.out.println(summ1);
    }

    public static int summaArray(int[] arr) {
        int summa = 0;
        for (int i = 0; i < arr.length; i++) {
            summa += arr[i];
        }
        return summa;
    }

    public static int summa(short a, short b) {
        int res = a + b;
        String result = "результат" + res;
        info(result);
        return res;
    }

    public static void info(String word) {
        System.out.println(word);
    }
}
