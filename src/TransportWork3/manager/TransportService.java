package TransportWork3.manager;

import TransportWork3.model.Transport;
import TransportWork3.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransportService {

    private final List<Transport> transports = new ArrayList<>();


    public void addTransport(Transport tr) {
        transports.add(tr);
    }

    public User findOwnerByLicensePlate(String licensePlate) {
        for (Transport transport : transports) {
            if (licensePlate.equals(transport.getLicensePlate())) {
                return transport.getUser();
            }
        }
        return null;
    }

    public Map<String, List<User>> groupOwnersByCarCount() {
        Map<String, List<User>> listMap = Map.of("1-2 машины", new ArrayList<>(), "3-5 машин", new ArrayList<>(), "6 и более машин", new ArrayList<>());
        Map<User, Integer> userIntegerMap = new HashMap<>();

        for (Transport transport : transports) {
            User user = transport.getUser();
            userIntegerMap.putIfAbsent(user, 1);
            if (userIntegerMap.containsKey(user)) {
                Integer sizeTransport = userIntegerMap.get(user);
                userIntegerMap.put(user, ++sizeTransport);
            }
        }
        for (Map.Entry<User, Integer> entry : userIntegerMap.entrySet()) {
            Integer size = entry.getValue();
            if (size > 0 && size < 3) {
                listMap.get("1-2 машины").add(entry.getKey());
            }
            if (size > 2 && size < 6) {
                listMap.get("3-5 машин").add(entry.getKey());
            } else {
                listMap.get("6 и более машин").add(entry.getKey());
            }
        }
        return listMap;
    }


}
