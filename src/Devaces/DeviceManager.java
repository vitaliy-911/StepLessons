package Devaces;

//void printDevice(Device device) – выводит информацию об устройстве.
//void printDevice(Device[] devices) – выводит информацию об устройствах.
//int getTotalDevices() – возвращает количество всех устройств.
//void chargeDevice(Chargeable device, int amount) – заряжает одно устройство.
//void chargeDevice(Chargeable[] devices, int amount) – заряжает массив устройств.
public class DeviceManager {

    public static void printDevice(Devace devace) {
        System.out.println(devace);
    }

    public static void printDevice(Devace[] devaces) {
        for (Devace dev : devaces) {
            System.out.println(dev);
        }
    }

    public static int getTotalDevices(Devace devace) {
        return devace.getTotalDevices();
    }

    public static void chargeDevice(Chargeable device, int amount) {
        device.charge(amount);
        System.out.println(device.getClass().getSimpleName() + " заряжаем на " + amount + "%");
    }

    public static void chargeDevice(Chargeable[] devices, int amount) {
        for (Chargeable dev : devices) {
            dev.charge(amount);
            System.out.println(dev.getClass().getSimpleName() + " заряжaем на " + amount + "%");
        }
    }
}