package TransportWork;

import java.util.*;

public class TransportManager {

    private List<Transport> transportList = new ArrayList<>();
    private Set<Transport> uniqueTransportSet = new TreeSet<>();

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
      TreeSet<Transport> sortedBySpeedSet = new TreeSet<>(new TransportSpeedComparator());
      sortedBySpeedSet.addAll(uniqueTransportSet);
       uniqueTransportSet = sortedBySpeedSet;
    }

    void sortTransportByModel() {
        transportList.sort(Comparator.comparing(Transport::getModel));
        TreeSet<Transport> sortedByModelSet = new TreeSet<>(new TransportModelComparator());
        sortedByModelSet.addAll(uniqueTransportSet);
        uniqueTransportSet = sortedByModelSet;

    }

    void printAllTransport() {
        System.out.println(transportList);
    }

    void printUniqueTransport() {
        System.out.println(uniqueTransportSet);

    }
}
