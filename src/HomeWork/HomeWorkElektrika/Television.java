package HomeWork.HomeWorkElektrika;

public class Television extends ElectronicDevice {
    private int zoom = 32;
    private String name = "Телевизор";

    public Television(String brand, String model, int power, int zoom) {
        super(brand, model, power);
        this.zoom = zoom;
    }

    @Override
    public String getStatus() {
        return name + " " + super.getStatus();
    }

    @Override
    public String toString() {
        return name + " " + super.toString() + "Размер экрана " + zoom;
    }
}
