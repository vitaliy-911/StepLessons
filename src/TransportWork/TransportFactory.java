package TransportWork;

import java.util.List;
import java.util.Random;

public class TransportFactory {

    private static Random random = new Random();

    private static List<String> model = List.of("BMW", "NISSAN", "AUDI", "HONDA");
    private static int val;

    public static Transport next() {
        String mod = model.get(random.nextInt(model.size()));
        val = random.nextInt(1, 3);
        switch (val) {
            case 1:

                return new Car(mod, random.nextInt(220), "GAZ");
            case 2:

                return new Bike(mod, 200, random.isDeprecated());
            case 3:

                return new Truck(mod, 100, random.nextInt(2000));


        }
        return null;
    }

}
