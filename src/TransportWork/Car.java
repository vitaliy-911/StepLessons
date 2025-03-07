package TransportWork;

public class Car extends Transport {
    private String fuelType;

    public Car(String model, int speed, String fuelType) {
        super(model, speed);
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return super.toString() + " " + fuelType;
    }


}
