package HomeWork.Qeuar;

import java.util.*;

public class Task00 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Dima");
        queue.offer("David");
        queue.offer("Don");
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(" ");
        Queue<Task> taskQueue = new PriorityQueue<>();
        taskQueue.offer(new Task("Запустить сервер", 1));
        taskQueue.offer(new Task("Проверить логи", 3));
        taskQueue.offer(new Task("Обновить базу", 2));
        System.out.println(taskQueue.poll());
        System.out.println(taskQueue);
        Deque<String> deque = new ArrayDeque<>();
        deque.offerFirst("Первый");
        deque.offerLast("Последний");

    }
}
