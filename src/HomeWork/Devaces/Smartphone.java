package HomeWork.Devaces;

public class Smartphone extends Devace implements Chargeable {

    private final int cameraResolution;

    public Smartphone(String serialNumber, String model, int batteryLevel,int cameraResolution) {
        super(serialNumber, model, batteryLevel);
        this.cameraResolution = cameraResolution;
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
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString() + " камера " + cameraResolution + " MP заряд " + getBatteryLevel() + "%";
    }
}
