package HomeWork.HomeWorkElektrika;

public class WorkElektric {
    public static void main(String[] args) {

        ElectronicDevice laptop = new Laptop("Samsung", "1457i", 210, 12);
        ElectronicDevice television = new Television("LG", "234rt5", 220, 32);
        ElectronicDevice smartPhone = new SmartPhone("Samsung", "e220", 9, 5);

        testPrint(laptop);
        testPrint(television);
        testPrint(smartPhone);
    }

    private static void testPrint(ElectronicDevice electronicDevice){
        System.out.println(electronicDevice);
        System.out.println("Состояние: " + electronicDevice.getStatus());
        electronicDevice.turnOn();
        System.out.println("Состояние: " + electronicDevice.getStatus());
        electronicDevice.turnOff();
        System.out.println("Состояние: " + electronicDevice.getStatus());
    }
}
