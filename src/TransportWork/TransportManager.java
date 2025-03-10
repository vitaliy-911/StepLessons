package TransportWork;

import java.util.*;

public class TransportManager {

    private final List<Transport> transportList = new ArrayList<>();
    private final Set<Transport> uniqueTransportSet = new HashSet<>();
    private Set<Transport> uniqueTransportTreeSet = new TreeSet<>();

    void addTransport(Transport transport) {
        transportList.add(transport);
        uniqueTransportSet.add(transport);
    }

    void removeTransport(String model) {
        transportList.removeIf(transport -> transport.getModel().equals(model));
        uniqueTransportSet.removeIf(transport -> transport.getModel().equals(model));
    }

    void sortTransportBySpeed() {
        transportList.sort(new TransportSpeedComparator());
        Set<Transport> sortedBySpeedSet = new TreeSet<>(new TransportSpeedComparator());
        sortedBySpeedSet.addAll(uniqueTransportSet);
        uniqueTransportTreeSet = sortedBySpeedSet;
    }

    void sortTransportByModel() {
        transportList.sort(Comparator.comparing(Transport::getModel));
        Set<Transport> sortedByModelSet = new TreeSet<>(new TransportModelComparator());
        sortedByModelSet.addAll(uniqueTransportSet);
        uniqueTransportTreeSet = sortedByModelSet;
    }

    void printAllTransport() {
        System.out.println(transportList);
    }

    void printUniqueTransport() {
        System.out.println(uniqueTransportSet);
    }

    void printUniqueSortTransport() {
        System.out.println(uniqueTransportTreeSet);
    }
}
