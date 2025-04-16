package HomeWork.HomeWorkElektrika;

public class Laptop extends ElectronicDevice {

    private int timeWorkeBattery;
    private String name ="Ноутбук";

    public Laptop(String brand, String model, int power, int timeWokeBattery) {
        super(brand, model, power);
        this.timeWorkeBattery = timeWokeBattery;

    }

    @Override
    public String getStatus() {
        return name + " " + super.getStatus();
    }

    @Override
    public String toString() {
        return name + " " + super.toString() + " Время работы от батареи " + timeWorkeBattery + " Часов ";
    }
}
