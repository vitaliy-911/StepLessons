package TransportWork2;

import java.util.*;

public class TransportManager {

    private final Map<String, Transport> transportByPlate = new HashMap<>();
    private final Map<String, List<Transport>> transportByType = new HashMap<>();

    void addTransport(Transport transport) {
        transportByPlate.put(transport.getLicensePlate(), transport);

        String type = transport.getClass().getSimpleName();
        transportByType.putIfAbsent(type, new ArrayList<>());
        transportByType.get(type).add(transport);
    }

    public Transport findTransportByPlate(String licensePlate) {
        return transportByPlate.get(licensePlate);
    }

    public void removeTransport(String licensePlate) {
        transportByPlate.remove(licensePlate);
        Set<String> keySet = transportByType.keySet();

        for (String key : keySet) {
            List<Transport> transports = transportByType.get(key);
            for (Transport transport : transports) {
                if (licensePlate.equals(transport.getLicensePlate())) {
                    transportByType.get(key).remove(transport);
                }
            }
        }
    }

//    public void removeTransport1(String licensePlate) {
//        Transport transport = transportByPlate.remove(licensePlate);
//
//        for (Map.Entry<String, List<Transport>> entry : transportByType.entrySet()) {
//            List<Transport> value = entry.getValue();
//            Iterator<Transport> iterator = value.iterator();
//            while (iterator.hasNext()) {
//                Transport next = iterator.next();
//                if (licensePlate.equals(next.getLicensePlate())) {
//                    iterator.remove();
//                }
//            }
//        }
//    }
//}

    public List<Transport> getTransportByType(String type) {
        return transportByType.get(type);
    }

    public Transport getFastestTransportByType(String type) {
        List<Transport> transports = getTransportByType(type);
        transports.sort(new TransportSpeedComparator());
        return transports.getLast();
    }

    void printAllTransport() {
        System.out.println(transportByPlate);

    }

    public Map<String, Transport> getTransportByPlate() {
        return transportByPlate;
    }

    public Map<String, List<Transport>> getTransportByType() {
        return transportByType;
    }
}


