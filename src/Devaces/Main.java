package Devaces;

public class Main {
    public static void main(String[] args) {

        Devace phone = new Smartphone("1234", "Samsung", 10, 14);
        Devace laptop = new Laptop("Pro", "MacBook", 20, 24);

        DeviceManager.printDevice(phone);
        DeviceManager.printDevice(laptop);

        System.out.println("Заряжаем устройства:");
        DeviceManager.chargeDevice((Chargeable) phone, 30);
        DeviceManager.chargeDevice((Chargeable) laptop, 50);

        System.out.println("После зарядки:");
        DeviceManager.printDevice(phone);
        DeviceManager.printDevice(laptop);

        Chargeable[] chargeables = {(Chargeable) phone, (Chargeable) laptop};
        System.out.println("Заряжаем все устройства еще раз:");
        DeviceManager.chargeDevice(chargeables, 60);

        System.out.println("после повторной зарядки:");
        DeviceManager.printDevice(phone);
        DeviceManager.printDevice(laptop);
    }
}
