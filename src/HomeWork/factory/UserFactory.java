package HomeWork.factory;

import HomeWork.model.User;

import java.util.List;
import java.util.Random;

public class UserFactory {
    private static Random random = new Random();

    private final static List<String> names = List.of("Коля","Витя","Катя","Лиля");

    public static User next() {
        return new User(names.get(random.nextInt(names.size())));
    }
}
