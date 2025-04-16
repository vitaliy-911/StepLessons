package HomeWork.manager;

import HomeWork.comparator.TransportSpeedComparator;
import HomeWork.model.Transport;
import HomeWork.model.User;

import java.util.*;

public class TransportUserManager {

    private final Map<User, List<Transport>> transportByOwner = new HashMap<>();

    public void addTransport(Transport transport) {
        User user = transport.getUser();
        transportByOwner.putIfAbsent(user, new ArrayList<>());
        transportByOwner.get(user).add(transport);
    }

    public List<Transport> getTransportByOwner(User owner) {
        return transportByOwner.get(owner);
    }

    public void removeTransport(User owner, String licensePlate) {
        List<Transport> transports = transportByOwner.get(owner);
        Iterator<Transport> iterator = transports.iterator();
        while (iterator.hasNext()) {
            Transport next = iterator.next();
            if (licensePlate.equals(next.getLicensePlate())) {
                iterator.remove();
            }
        }
    }

    public Transport getFastestTransportByType(User owner) {
        List<Transport> transportsBySpeed = transportByOwner.get(owner);
        transportsBySpeed.sort(new TransportSpeedComparator());
        return transportsBySpeed.getLast();

    }

    public User UserFindOwnerWithMostCars() {
        TreeMap<Integer, User> ownersCarsNum = new TreeMap<>();
        for (Map.Entry<User, List<Transport>> entry : transportByOwner.entrySet()) {
            int size = entry.getValue().size();
            User value = entry.getKey();
            ownersCarsNum.put(size, value);
        }
        return ownersCarsNum.lastEntry().getValue();
    }

    public void printAllOwnersAndTransport() {
        for (Map.Entry<User, List<Transport>> owner : transportByOwner.entrySet()) {
            System.out.println(owner.getKey());
            System.out.println(owner.getValue());
        }
    }
}


