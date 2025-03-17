package TransportWork3.model;

public class Bike extends Transport {

    private final boolean hasSidecar;

    public Bike(String model, int speed, String licensePlate, int year,boolean hasSidecar) {
        super(model, speed, licensePlate, year);
        this.hasSidecar= hasSidecar;
    }


    @Override
    public String toString() {
        return super.toString() + " " + (hasSidecar ? "без коляски" : "с коляской");
    }


}
