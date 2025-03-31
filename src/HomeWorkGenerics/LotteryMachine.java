package HomeWorkGenerics;

import java.util.*;

public class LotteryMachine<T extends Participant> {

    private final List<T> allItems = new ArrayList<>();
    private final List<T> winners = new ArrayList<>(2);
    private final Queue<T> queue = new ArrayDeque<>() {
    };

    private boolean initialized;
    private static int MAX_WINERS = 2;
    private int countRoundWiners = 0;

    public void add(T item) {
        if (!initialized && item.getAge() > 18) {
            allItems.add(item);
        }

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
        if (countRoundWiners == MAX_WINERS) {
            return null;
        }
        T winner = queue.poll();
        if (winner != null) {
            countRoundWiners++;
            allItems.remove(winner);
            winners.add(winner);

        }
        return queue.poll();
    }

    public void reset() {
        queue.clear();
        Collections.shuffle(allItems);
        queue.addAll(allItems);
        countRoundWiners = 0;
    }

    public int remaining() {
        return queue.size();

    }

//    public Map<Sex, Integer> sexToWinner() {
//        Map<Sex, Integer> sexToWinner =new HashMap<>(Map.of("18-30",))
//        return
//    }


}


