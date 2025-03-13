package ClassWork.L16_01_25;

//import utils.ArrayUtil;
//
//import java.util.Arrays;
//
//public class Task02 {
//    public static void main(String[] args) {
//        // deleteNumFromArray();
//        //  isPalindrome();
//
//    }
//
//    private static void deleteNumFromArray() {
//        int[] intArray = ArrayUtil.generateIntArray(10, 0, 60);
//        int deleteIndex = 2;//удаление элемента по индексу 2
//        if (deleteIndex < intArray.length && deleteIndex >= 0) {
//            int[] array = new int[intArray.length - 1];
//            for (int i = 0, j = 0; i < intArray.length; i++) {
//                if (deleteIndex == i) {
//                    continue;
//                }
//                array[j] = intArray[i];
//                j++;
//            }
//            System.out.println(Arrays.toString(array));
//        } else {
//            System.out.println("индекс вне диапазона");
//        }
//    }
//
//    private static void isPalindrome() {
//        int[] array = {1, 2, 3, 4, 3, 2, 1};
//        boolean isPalidrome = true;
//        for (int i = 0; i < array.length / 2; i++) {
//            if (array[i] != array[array.length - 1 - i]) {
//                isPalidrome = false;
//                break;
//            }
//        }
//        System.out.println(isPalidrome ? "симметричный" : "не симметричный");
//    }
//}
