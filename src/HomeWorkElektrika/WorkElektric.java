package HomeWorkElektrika;

public class WorkElektric {
    public static void main(String[] args) {

        Laptop laptop = new Laptop("Samsung", "1457i", 210, 12);
        Television television = new Television("LG", "234rt5", 220, 32);
        SmartPhone smartPhone = new SmartPhone("Samsung", "e220", 9, 5);

        System.out.println(laptop.toString());
        System.out.println("Состояние: " + laptop.getStatus());
        laptop.turnOn();
        System.out.println("Состояние: " + laptop.getStatus());
        laptop.turnOff();
        System.out.println("Состояние: " + laptop.getStatus());

        System.out.println(television.toString());
        System.out.println("Состояние: " + television.getStatus());
        television.turnOn();
        System.out.println("Состояние: " + television.getStatus());
        television.turnOff();
        System.out.println("Состояние: " + television.getStatus());

        System.out.println(smartPhone.toString());
        System.out.println("Состояние: " + smartPhone.getStatus());
        smartPhone.turnOn();
        System.out.println("Состояние: " + smartPhone.getStatus());
        smartPhone.turnOff();
        System.out.println("Состояние: " + smartPhone.getStatus());

    }
}
