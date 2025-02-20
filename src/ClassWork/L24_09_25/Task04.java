package ClassWork.L24_09_25;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int result=0;
        while (true){
            int value= scanner.nextInt();
            if (value<0){
                break;
            }
            result+=value;
        }
        System.out.println(result);
    }
}
