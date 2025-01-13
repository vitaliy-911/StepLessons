package Lesson1_12_24;

//рисуем прямоугольник
public class Lesson1 {
    public static void main(String[] args) {
        int r = 5;
        int t = 4;
        int res = 0;
        for (int i = r; i > 1; i++) {
            System.out.print("8");
            if (i == 9) {
                System.out.println();
                i = 4;
                res++;
                if (res == t) {
                    break;
                }
            }

        }


//        for (int i = 0; i < r; i++) {
//            System.out.print("8");
//            if (i == 10) {
//                System.out.println();
//                i = 4;
//                res++;
//                if (res == t) {
//                    break;
//                }
//            }
//
//        }

    }
}