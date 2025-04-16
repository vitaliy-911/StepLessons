package HomeWork.HomeWorkGenericsAndExceptionLotto;

import java.util.List;
import java.util.Random;

public class ParticipantFactory {

    private final static Random random = new Random();

    private ParticipantFactory() {
    }

    private final static List<String> womensName = List.of("Anna", "Polly", "Ges");
    private final static List<String> mensName = List.of("David", "Henry", "Harry", "Poll");

    public static Participant next() {
        boolean sex = random.nextBoolean();
        if (sex) {
            String name = mensName.get(random.nextInt(mensName.size()));
            int age = random.nextInt(17, 60);
            int id = random.nextInt(1000, 2000);
            Participant participant = new Participant(name, age, Sex.Men, id);
            participant.setAgeType(getAgeTypeByGamerAge(participant));
            return participant;
        } else {
            String name = womensName.get(random.nextInt(womensName.size()));
            int age = random.nextInt(17, 60);
            int id = random.nextInt(1000, 2000);
            Participant participant = new Participant(name, age, Sex.Women, id);
            participant.setAgeType(getAgeTypeByGamerAge(participant));
            return participant;
        }
    }

    public static AgeType getAgeTypeByGamerAge(Participant participant) {
        if (participant.getAge() < 18) {
            System.err.println("Меньше 18 лет");
        }

        int age = participant.getAge();

        if (age >= 18 && age < 30) {
            return AgeType.YOUNG;
        } else if (age > 30 && age < 50) {
            return AgeType.AVERAGE;
        }
        else {
            return AgeType.OLD;
        }
    }
}


