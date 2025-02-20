package HomeWorkElektrika;

public class ElectronicDevice {
    private String brand;
    private String model;
    private int power;
    private boolean isOn;

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

    public String getStatus() {
        return isOn ? "Включен" : "Выключен";
    }

    @Override
    public String toString() {
        return brand + " " + model + " Мощность " + power + " Вт ";

    }
}