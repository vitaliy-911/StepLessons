package HomeWork;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите обьем потребленного газа (м.куб)");
        int gaz = scanner.nextInt();
        System.out.println("Введите обьем потребленной холодной воды (м.куб)");
        int coldWater = scanner.nextInt();
        System.out.println("Введите обьем потребленной горячей воды (м.куб)");
        int hotWater = scanner.nextInt();
        System.out.println("Введите обьем потребленной электроэнергии (квт.час)");
        int electricity = scanner.nextInt();
        System.out.println("Введите площадь квартиры (м.кв.)");
        int square = scanner.nextInt();

        int resGaz = gaz * 54;
        int resWater = (hotWater + coldWater) * 90;
        int resHeatingWater = hotWater * 200;
        int resElectricity = electricity * 100;
        int resSquare = square * 84;
        int result = resGaz + resWater + resHeatingWater + resElectricity + resSquare;

        System.out.println("сумма платежей : ");
        System.out.println("За газ  .............: " + resGaz / 100 + " руб " + resGaz % 100 + " коп ");
        System.out.println("За воду .............: " + resWater / 100 + " руб " + resWater % 100 + " коп ");
        System.out.println("За электроэнергию ...: " + resElectricity / 100 + " руб " + resElectricity % 100 + " коп ");
        System.out.println("За подогрев воды ....: " + resHeatingWater / 100 + " руб " + resHeatingWater % 100 + " коп ");
        System.out.println("За квартиру .........: " + resSquare / 100 + " руб " + resSquare % 100 + " коп ");
        System.out.println("Итого ...............: " + result / 100 + " руб " + result % 100 + " коп ");

    }
}
