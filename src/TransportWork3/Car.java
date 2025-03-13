package TransportWork3;

public class Car extends Transport {

    private final String fuelType;

    public Car(String model, int speed, String licensePlate, int year,String fuelType) {
        super(model, speed, licensePlate, year);
        this.fuelType=fuelType;
    }


    @Override
    public String toString() {
        return super.toString() + " Вид топлива " + fuelType;
    }
}
