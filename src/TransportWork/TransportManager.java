package TransportWork;

import java.util.*;

public class TransportManager {

    static List<Transport> transportList = new ArrayList<>();
    static Set<Transport> uniqueTransportSet = new HashSet<>();

    void addTransport(Transport transport) {
        transportList.add(transport);
        uniqueTransportSet.add(transport);
    }

    void removeTransport(String model) {
        transportList.removeIf(transport -> transport.getModel().equals(model));
        uniqueTransportSet.removeIf(transport -> transport.getModel().equals(model));
    }

    private static void sortTransportBySpeed(List<Transport> transportList) {

    }


}
