package TransportWork3;

public class Truck extends Transport {

    private final int loadCapacity;

    public Truck(String model, int speed, String licensePlate, int year,int loadCapacity) {
        super(model, speed, licensePlate, year);
        this.loadCapacity=loadCapacity;
    }


    @Override
    public String toString() {
        return super.toString() + " Грузоподьемность " + loadCapacity;
    }
}
