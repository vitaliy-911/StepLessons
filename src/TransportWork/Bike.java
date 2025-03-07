package TransportWork;

public class Bike extends Transport {

    private final boolean hasSidecar;

    public Bike(String model, int speed, boolean hasSidecar) {
        super(model, speed);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String toString() {
        return super.toString() + " " + hasSidecar;
    }

}
