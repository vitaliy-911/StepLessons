package HomeWorkQueue;

import java.util.LinkedList;
import java.util.Queue;

public class BusStop {
    private Queue<String> queue = new LinkedList<>();

    public void addPassenger(String name) {
        queue.offer(name);

    }

    public String boardBus() {
        if (queue.size() == 0) {
            return "Автобус уехал пустой";
        }
        String name = queue.remove();
        return name + "сел в автобус";
    }


}
