package TransportWork;

import java.util.Comparator;

public class TransportSpeedComparator implements Comparator<Transport> {
    @Override
    public int compare(Transport o1, Transport o2) {
        Integer.compare(o1.getSpeed(),o2.getSpeed());
        return o1.getSpeed() - o2.getSpeed();
    }
}
