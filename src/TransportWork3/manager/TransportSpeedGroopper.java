package TransportWork3.manager;

import TransportWork3.model.Transport;

import java.util.*;

public class TransportSpeedGroopper {
    private final Map<Integer, Set<Transport>> transportBySpeed = new HashMap<>();

    public void add(Transport transport) {
        int speed = transport.getSpeed();
        transportBySpeed.putIfAbsent(speed, new TreeSet<>());
        transportBySpeed.get(speed).add(transport);
    }

    Set<Transport> getTransportBySpeed(int speed) {
        return transportBySpeed.get(speed);
    }
}
