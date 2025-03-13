package TransportWork;

import java.util.List;
import java.util.Random;

public class TransportFactory {

    private static final Random random = new Random();

    private final static List<String> model = List.of("BMW", "NISSAN", "AUDI", "HONDA");
    private final static List<String> fuel = List.of("GAZ", "DESEL", "FUEL", "ELECTRICITY");

    public static Transport next() {
        String mod = model.get(random.nextInt(model.size()));
        String fuel1 = fuel.get(random.nextInt(fuel.size()));
        int speed = random.nextInt(100, 250);
        int val = random.nextInt(1, 4);
        return switch (val) {
            case 1 -> new Car(mod, speed, fuel1);
            case 2 -> new Bike(mod, speed, random.nextBoolean());
            case 3 -> new Truck(mod, speed, random.nextInt(1500, 2000));
            default -> null;
        };
    }
}
