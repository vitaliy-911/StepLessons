package HomeWorkElektrika;

public class Laptop extends ElectronicDevice {
    private int timeWorkeBattery;

    public Laptop(String brand, String model, int power, int timeWokeBattery) {
        super(brand, model, power);
        this.timeWorkeBattery = timeWokeBattery;
    }

    @Override
    public void getStatus() {
        super.getStatus();
    }

    @Override
    public String toString() {
        return super.toString() + timeWorkeBattery;
    }
}
