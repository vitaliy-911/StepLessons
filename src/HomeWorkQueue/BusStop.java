package HomeWorkQueue;

import java.util.LinkedList;
import java.util.Queue;

public class BusStop {

    //    Реализовать методы:
//    void addPassenger(String name) – добавить пассажира в очередь.
//    String boardBus() – убрать пассажира из очереди (он сел в автобус).
//    int getQueueSize() – узнать количество ожидающих пассажиров.
//    String peekNextPassenger() – посмотреть, кто следующий в очереди (без удаления).

    private final Queue<String> queue = new LinkedList<>();

    public void addPassenger(String name) {
        queue.offer(name);
        System.out.println(name + " встал в очередь на автобус ");
    }

    public String boardBus() {
        if (queue.isEmpty()) {
            return "Автобус уехал пустой";
        }
        String name = queue.remove();
        System.out.println(name + " сел в автобус ");
        return name;
    }

    public int getQueueSize() {
        int passenger = queue.size();
        System.out.println(passenger + " колличество ожидающих пассажиров ");
        return passenger;
    }

    public String peekNextPassenger() {
        String element = queue.element();
        System.out.println(element + " следующий в очереди ");
        return element;
    }
}
