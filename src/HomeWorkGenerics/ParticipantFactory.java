package HomeWorkGenerics;

import java.util.List;
import java.util.Random;

public class ParticipantFactory {

    private final static Random random = new Random();

    private ParticipantFactory() {
    }

    private final static List<String> names = List.of("Anna", "Polly", "Ges");
    private final static List<String> mens = List.of("David", "Henry", "Harry", "Poll");

//    public static Participant next() {
//        boolean sex = random.nextBoolean();
//
//
//        String name = names.get(random.nextInt(names.size()));
//        int age = random.nextInt(17, 60);
//
//
//        return new Participant(name, age, )
//    }
}


