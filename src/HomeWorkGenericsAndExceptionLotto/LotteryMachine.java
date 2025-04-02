package HomeWorkGenericsAndExceptionLotto;

import java.util.*;

public class LotteryMachine<T extends Participant> {

    private final List<T> allItems = new ArrayList<>();
    private final List<T> winners = new ArrayList<>(2);
    private final Queue<T> queue = new ArrayDeque<>() {
    };

    private boolean initialized;
    private static int MAX_WINERS = 2;
    private int countRoundWiners = 0;

    public void add(T item) throws UnderageException, DuplicateParticipantException {
        Participant participant =(Participant) item;
        if (initialized) {
            return;
        }
        if (item.getAge() < 18) {
            throw new UnderageException("Возраст менее 18 лет");
        }
        if (item.equals(item.getPassportId())) {
            throw new DuplicateParticipantException("С такими паспотным номером учасник уже есть");
        }
        allItems.add(item);
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

    public T pick() throws MaxWinnersExceededException {
        if (!initialized) {
            init();
        }
        if ((winners.size() > MAX_WINERS)) {
            throw new MaxWinnersExceededException("превышен лимит победителей");
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

    public void reset() throws NotInitializedException {
        if (!initialized) {
            throw new NotInitializedException("Розыгрыш не начат");
        }
        queue.clear();
        Collections.shuffle(allItems);
        queue.addAll(allItems);
        countRoundWiners = 0;
    }

    public int remaining() {
        return queue.size();
    }

    public Map<Age, Integer> ageToWinners() {
        Map<Age, Integer> map = new HashMap<>(Map.of(Age.YOUNG, 0, Age.AVERAGE, 0, Age.OLD, 0));
        for (T winner : winners) {

            int age = winner.getAge();
            if (age < 30) {
                map.put(Age.YOUNG, map.get(Age.YOUNG) + 1);
            }
            if (age > 30 && age < 50) {
                map.put(Age.AVERAGE, map.get(Age.AVERAGE) + 1);
            }
            if (age > 50) {
                map.put(Age.OLD, map.get(Age.OLD) + 1);
            }
        }
        return map;
    }

}
