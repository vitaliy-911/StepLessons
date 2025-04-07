package HomeWork.factory;

import HomeWork.model.Bike;
import HomeWork.model.Car;
import HomeWork.model.Transport;
import HomeWork.model.Truck;

import java.util.List;
import java.util.Random;

public class TransportFactory {

    private static final Random random = new Random();

    private final static List<String> model = List.of("BMW", "NISSAN", "AUDI", "HONDA");
    private final static List<String> fuel = List.of("GAZ", "DESEL", "FUEL", "ELECTRICITY");

    private TransportFactory() {
    }

    public static Transport next() {

        String randomlicensePlate = String.valueOf(random.nextInt(1000, 9999));
        String mod = model.get(random.nextInt(model.size()));
        String fuel1 = fuel.get(random.nextInt(fuel.size()));
        int speed = random.nextInt(100, 250);
        int val = random.nextInt(1, 4);
        int year = random.nextInt(2000, 2025);
        return switch (val) {
            case 1 -> new Car(mod, speed, randomlicensePlate, year, fuel1);
            case 2 -> new Bike(mod, speed, randomlicensePlate, year, random.nextBoolean());
            case 3 -> new Truck(mod, speed, randomlicensePlate, year, random.nextInt(1500, 2000));
            default -> null;
        };
    }
}
