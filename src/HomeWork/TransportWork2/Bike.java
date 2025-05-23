package HomeWork.TransportWork2;

public class Bike extends Transport {

    private final boolean hasSidecar;

    public Bike(String model, int speed, String licensePlate, boolean hasSidecar) {
        super(model, speed, licensePlate);
        this.hasSidecar=hasSidecar;
    }

    @Override
    public String toString() {
        return super.toString() + " " + (hasSidecar ? "без коляски" : "с коляской");
    }


}
