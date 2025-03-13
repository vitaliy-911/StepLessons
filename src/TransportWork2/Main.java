package TransportWork2;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        TransportManager manager = new TransportManager();

        for (int i = 0; i < 20; i++) {
            manager.addTransport(TransportFactory.next());
        }



        Transport wet = manager.findTransportByPlate("4235");
        System.out.println(wet);


        Transport fastestTransportByType = manager.getFastestTransportByType("Car");
        manager.printAllTransport();

        System.out.println(fastestTransportByType);

    }
}
