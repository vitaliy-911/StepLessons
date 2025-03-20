package TransportWork3.comparator;

import TransportWork3.model.Transport;

import java.util.Comparator;

public class TransportModelComparator implements Comparator<Transport> {

    @Override
    public int compare(Transport o1, Transport o2) {
        return o1.getModel().compareTo(o2.getModel());
    }

}


