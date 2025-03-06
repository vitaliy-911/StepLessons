package TransportWork;

public class Truck extends Transport {

    private int loadCapacity;

    public Truck(String model, int speed, int loadCapacity) {
        super(model, speed);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + " " + loadCapacity;
    }
}
