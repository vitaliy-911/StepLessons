package TransportWork;

import java.util.List;
import java.util.Random;

public class TransportFactory {

    private static Random random = new Random();

    private final static List<String> model = List.of("BMW", "NISSAN", "AUDI", "HONDA");
    private static int val;

    public static Transport next() {
        String mod = model.get(random.nextInt(model.size()));
        int speed= random.nextInt(100,250);
        val = random.nextInt(1, 4);
        switch (val) {
            case 1:

                return new Car(mod, speed, "GAZ");
            case 2:

                return new Bike(mod,speed, random.isDeprecated());
            case 3:

                return new Truck(mod,speed, random.nextInt(1500,2000));
        }
        return null;
    }

}
