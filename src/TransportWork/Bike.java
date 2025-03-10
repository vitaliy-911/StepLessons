package TransportWork;

import java.util.Random;

public class Bike extends Transport {
    private Random random=new Random();

    private final boolean hasSidecar;

    public Bike(String model, int speed, boolean hasSidecar) {
        super(model, speed);
        this.hasSidecar =random.nextBoolean();
    }

    @Override
    public String toString() {
        return super.toString() + " " + (hasSidecar ? "без коляски" : "с коляской");
    }


}
