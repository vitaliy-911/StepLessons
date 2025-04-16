package HomeWork.StudentWork;

import java.util.List;
import java.util.Random;

public class StudentFactory {
    private static Random random = new Random();

    private final static List<String> names = List.of("Коля", "Витя", "Катя", "Лиля");

    public static Student next() {
        return new Student(names.get(random.nextInt(names.size())), random.nextInt(18, 25), random.nextDouble(5, 8));
    }
}
