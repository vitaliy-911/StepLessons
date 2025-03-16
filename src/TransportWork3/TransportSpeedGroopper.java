package TransportWork3;

import java.util.*;

public class TransportSpeedGroopper {
    private final Map<Integer, Set<Transport>> transportBySpeed = new HashMap<>();

    public void add(Transport transport) {
        int speed = transport.getSpeed();
        transportBySpeed.putIfAbsent(speed, new TreeSet<>());
        transportBySpeed.get(speed).add(transport);
    }

    Set<Transport> getTransportBySpeed(int speed) {
        System.out.println(transportBySpeed.containsKey(speed)
                ? transportBySpeed.get(speed) : "Транспорта с такой скоростью нет.");
        return transportBySpeed.get(speed);
    }
}
