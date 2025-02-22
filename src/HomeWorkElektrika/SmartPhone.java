package HomeWorkElektrika;

public class SmartPhone extends ElectronicDevice {
    private int zoomX;
    final String name = "Смартфон";

    public SmartPhone(String brand, String model, int power, int zoomX) {
        super(brand, model, power);
        this.zoomX = zoomX;
    }

    @Override
    public String getStatus() {
        return name + " " + super.getStatus();
    }


    @Override
    public String toString() {
        return super.toString() + "Разрешение камеры " + zoomX;
    }
}
