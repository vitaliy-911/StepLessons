package HomeWorkElektrika;

public class ElectronicDevice {
    protected String brand;
    protected String model;
    protected int power;
    protected boolean isOn;

    public ElectronicDevice(String brand, String model, int power) {
        this.brand = brand;
        this.model = model;
        this.power = power;
    }

    public void turnOn() {
        isOn = true;
        System.out.println(model + " от " + brand + " Включен.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(model + " от " + brand + " Выключен.");
    }

    public void getStatus() {
        System.out.println(brand + " " + model + (isOn ? " Включен " : " Выключен "));
    }

    @Override
    public String toString() {
        return "Устройство : " + brand + " " + model + " Мощность " + power + " Вт ";

    }
}