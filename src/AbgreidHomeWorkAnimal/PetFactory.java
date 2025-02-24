package AbgreidHomeWorkAnimal;

import java.util.Random;

public class PetFactory {

    private static Random random = new Random();

    public static Pet next() {
        boolean isDog = random.nextBoolean();
        if (isDog)
            return new Dog();
        else {
            return new Cat();
        }
    }
}







