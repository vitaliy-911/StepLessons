package HomeWorkGenerics;

import java.util.*;

public class LotteryMachine<T> {

    private final List<T> allItems = new ArrayList<>();
    private final List<T>winner=new ArrayList<>(2);
    private final Queue<T> queue = new ArrayDeque<>() {};
    private boolean initialized;


    public void add(T item) {
        if (!initialized) {
            allItems.add(item);
        } else {
            System.out.println("Розыгрыш начался");
        }
    }

    public void init() {
        if (!initialized) {
            Collections.shuffle(allItems);
            queue.addAll(allItems);
            initialized = true;
        } else {
            System.out.println("Розыгрыш начался");
        }
    }

    public T pick() {
        if (!initialized) {
            init();
        }
        return queue.poll();
    }

    public void reset() {

        queue.clear();
        Collections.shuffle(allItems);
        queue.addAll(allItems);
    }

    public int remaining() {
        return queue.size();

    }


}


