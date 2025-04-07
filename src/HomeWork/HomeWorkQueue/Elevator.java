package HomeWork.HomeWorkQueue;

import java.util.Deque;
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
    private final Deque<String> deque = new LinkedList<>();
    private final int maxCapacity;

    public Elevator(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void enter(String person) {
        deque.add(person);
        System.out.println(person + " зашел в лифт ");
        if (deque.size() > getMaxCapacity()) {
            System.out.println("Лифт переполнен движение не возможно");
            deque.removeLast();
            System.out.println("Вышел последний входящий в лифт");
        }
    }

    public String exit() {
        String person = deque.remove();
        System.out.println(person + " вышел из лифта ");
        return person;
    }

    public int getCurrentPassengers() {
        int passengers = deque.size();
        System.out.println(passengers + " пассажиров в лифте ");
        return passengers;
    }

    public String peekNextToExit() {
        String passenger = deque.element();
        System.out.println(passenger + " следующий в очереди ");
        return passenger;
    }

    public boolean isFull() {
        if (deque.isEmpty()) {
            System.out.println("Лифт не заполнен");
            return false;
        } else {
            System.out.println("Лифт с пассажиром");
            return true;
        }
    }
}
