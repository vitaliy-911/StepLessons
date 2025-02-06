package HomeWorkElektrika;

public class Television extends ElectronicDevice {
    private int zoom;

    public Television(String brand, String model, int power, int zoom) {
        super(brand, model, power);
        this.zoom = zoom;
    }

    @Override
    public void getStatus() {
        super.getStatus();
    }

    @Override
    public String toString() {
        return super.toString() + zoom;
    }
}
