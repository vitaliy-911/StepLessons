package TransportWork3;

import java.util.*;

public class TransportUserManager {

    private final Map<User, List<Transport>> transportByOwner = new HashMap<>();

    public void addTransport(User user, Transport transport) {
        transportByOwner.putIfAbsent(user, new ArrayList<>());
        transportByOwner.get(user).add(transport);
    }

    public  List<Transport> getTransportByOwner(User owner) {
        System.out.println(owner + " " + transportByOwner.get(owner));
        return transportByOwner.get(owner);
    }

    public void removeTransport(User owner, String licensePlate) {
        List<Transport> transports = transportByOwner.get(owner);
        if (transports != null) {
            Iterator<Transport> iterator = transports.iterator();
            while (iterator.hasNext()) {
                Transport next = iterator.next();
                if (licensePlate.equals(next.getLicensePlate())) {
                    iterator.remove();
                    System.out.println("Удалён транспорт с номером: " + licensePlate);
                    break;
                }
            }
        }
        System.out.println("номер не найден");
    }

    public Transport getFastestTransportByType(User owner) {
        List<Transport> transportsBySpeed = transportByOwner.get(owner);
        if (transportsBySpeed != null) {
            transportsBySpeed.sort(new TransportSpeedComparator());
            System.out.println(owner + " " + transportsBySpeed.getLast());
            return transportsBySpeed.getLast();
        }
        return null;
    }

    public void UserFindOwnerWithMostCars() {
        TreeMap<Integer, User> ownersCarsNum = new TreeMap<>();
        for (Map.Entry<User, List<Transport>> entry : transportByOwner.entrySet()) {
            int size = entry.getValue().size();
            User value = entry.getKey();
            ownersCarsNum.put(size, value);
        }
        System.out.println("Владелец с самым большим числом транспорта: " + ownersCarsNum.lastEntry().getValue());

    }

    public void printAllOwnersAndTransport() {
        for (Map.Entry<User, List<Transport>> owner : transportByOwner.entrySet()) {
            System.out.println(owner.getKey());
            System.out.println(owner.getValue());
        }
    }
}


