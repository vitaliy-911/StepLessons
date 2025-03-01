package Devaces;
//Smartphone – добавляет поле int cameraResolution (разрешение камеры).
//Переопределяет toString() для добавления информации о камере.
//charge() увеличивает уровень заряда, но не больше 100%

public class Smartphone extends Devace implements Chargeable {

    private final int cameraResolution;

    public Smartphone(String serialNumber, String model, int batteryLevel) {
        super(serialNumber, model, batteryLevel);
        this.cameraResolution = 12;
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
        return super.toString() + " камера " + cameraResolution + " MP заряд " + batteryLevel + "%";
    }
}
