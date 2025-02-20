package ClassWork.L19_12_24;

public class Task2 {
    public static void main(String[] args) {

        int ves = 78;
        int rost = 170;

        int res = rost - 110;
        int res1=ves-res;


        if (res > ves) {
            System.out.println(" худеем на " + res1);
        } else if (res < ves) {
            System.out.println(" толстеем на " + res1);
        } else {
            System.out.println("норм");
        }


    }
}
