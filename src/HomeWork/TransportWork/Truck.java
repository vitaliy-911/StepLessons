package HomeWork.TransportWork;

public class Truck extends Transport {

    private final int loadCapacity;

    public Truck(String model, int speed, int loadCapacity) {
        super(model, speed);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + " Грузоподьемность " + loadCapacity;
    }
}
