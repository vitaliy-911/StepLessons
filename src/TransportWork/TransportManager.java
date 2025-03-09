package TransportWork;

import java.util.*;

public class TransportManager {

    public final static TransportManager manager = new TransportManager();

    static List<Transport> transportList = new ArrayList<>();
    static Set<Transport> uniqueTransportSet = new HashSet<>();
    static List<Transport>sortUniqueTransportSet=new ArrayList<>(uniqueTransportSet);

    void addTransport(Transport transport) {
        transportList.add(transport);
        uniqueTransportSet.add(transport);
    }

    void removeTransport(String model) {

        transportList.removeIf(transport -> transport.getModel().equals(model));
        uniqueTransportSet.removeIf(transport -> transport.getModel().equals(model));
    }

    void sortTransportBySpeed() {
        transportList.sort(Comparator.comparing(Transport::getSpeed));
        sortUniqueTransportSet.sort(Comparator.comparing(Transport::getSpeed));
    }

    void sortTransportByModel() {
        transportList.sort(Comparator.comparing(Transport::getModel));
        sortUniqueTransportSet.sort(Comparator.comparing(Transport::getModel));
    }

    void printAllTransport() {
        System.out.println(transportList);
    }

    void printUniqueTransport() {
        System.out.println(uniqueTransportSet);
    }
}
