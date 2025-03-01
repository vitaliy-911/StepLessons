package Devaces;

public class Laptop extends Devace implements Chargeable {

    private final int batteryLife;

    public Laptop(String serialNumber, String model, int batteryLevel) {
        super(serialNumber, model, batteryLevel);
        this.batteryLife = 18;
    }


    @Override
    public void charge(int amount) {
        batteryLevel = Math.min(100, batteryLevel + amount);
    }

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public String toString() {
        return super.toString() + " время работы от батареи " + batteryLife + " часов заряд " + batteryLevel + "%";
    }
}
