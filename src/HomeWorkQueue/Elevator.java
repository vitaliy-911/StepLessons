package HomeWorkQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Elevator {
    //    Использовать Queue<String>, чтобы моделировать работу лифта.
//    Реализовать методы:
//    void enter(String person) – пассажир заходит в лифт.
//    String exit() – пассажир выходит из лифта.
//    int getCurrentPassengers() – узнать, сколько пассажиров в лифте.
//    String peekNextToExit() – посмотреть, кто выйдет первым (без удаления).
//    boolean isFull() – проверить, заполнен ли лифт.
//    class Elevator
//    private final int maxCapacity; Проверяйте и задайте (через конструктор) сколько людей может поместится в лифте.
    private final Queue<String> queue = new LinkedList<>();
    private final int maxCapacity;

    public Elevator(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void enter(String person) {
        queue.add(person);
        System.out.println(person + " зашел в лифт ");
        if (queue.size() > getMaxCapacity()) {
            System.out.println("Лифт переполнен движение не возможно");
        }
    }

    public String exit() {
        String person = queue.remove();
        System.out.println(person + " вышел из лифта ");
        return person;
    }

    public int getCurrentPassengers() {
        int passengers = queue.size();
        System.out.println(passengers + " пассажиров в лифте ");
        return passengers;
    }

    public String peekNextToExit() {
        String passenger = queue.element();
        System.out.println(passenger + " следующий в очереди ");
        return passenger;
    }

    public boolean isFull() {
        if (queue.isEmpty()) {
            System.out.println("Лифт не заполнен");
            return false;
        } else {
            System.out.println("Лифт с пассажиром");
            return true;
        }
    }
}
