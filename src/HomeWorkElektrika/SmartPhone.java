package HomeWorkElektrika;

public class SmartPhone extends ElectronicDevice {
    private int zoomX;

    public SmartPhone(String brand, String model, int power, int zoomX) {
        super(brand, model, power);
        this.zoomX = zoomX;
    }

    @Override
    public void getStatus() {
        super.getStatus();
    }

    @Override
    public String toString() {
        return super.toString() + zoomX;
    }
}
