package HomeWorkElektrika;

public class WorkElektric {
    public static void main(String[] args) {

        Laptop laptop = new Laptop("Samsung", "1457i", 220, 12);
        Television television = new Television("LG", "234rt5", 220, 32);
        SmartPhone smartPhone = new SmartPhone("Samsung", "e220", 9, 5);

        System.out.println(laptop.toString());
        laptop.getStatus();
        laptop.turnOn();
        laptop.getStatus();
        laptop.turnOff();
        laptop.getStatus();

        System.out.println(television.toString());
        television.getStatus();
        television.turnOn();
        television.getStatus();
        television.turnOff();
        television.getStatus();

        System.out.println(smartPhone.toString());
        smartPhone.getStatus();
        smartPhone.turnOn();
        smartPhone.getStatus();
        smartPhone.turnOff();
        smartPhone.getStatus();

    }
}
