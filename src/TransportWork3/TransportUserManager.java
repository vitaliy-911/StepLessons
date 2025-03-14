package TransportWork3;

import java.util.*;

public class TransportUserManager {

    private final Map<User, List<Transport>> transportByOwner = new HashMap<>();


    public void addTransport(User user, Transport transport, int size) {
        TreeSet<Transport>transports=new TreeSet<>();
        for (int i = 0; i < size; i++) {
           transports.add(transport);
        }
        transportByOwner.putIfAbsent(user, new ArrayList<>(transports));
        transportByOwner.get(user).add(transport);
    }

    public List<Transport> getTransportByOwner(User owner) {
        return transportByOwner.get(owner);
    }

    public void removeTransport(User owner, String licensePlate) {
        Set<User> keySet = transportByOwner.keySet();

        for (User key : keySet) {
            List<Transport> transports = transportByOwner.get(key);
            for (Transport transport : transports) {
                if (licensePlate.equals(transport.getLicensePlate())) {
                    transportByOwner.get(key).remove(transport);
                }
            }
        }
    }

    public Transport getFastestTransportByType(User owner) {
        List<Transport> transports = transportByOwner.get(owner);
        transports.sort(new TransportSpeedComparator());
        return transports.getLast();
    }

    public void printAllOwnersAndTransport() {
        System.out.println(transportByOwner);
    }

}
