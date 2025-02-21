package AbgreidHomeWorkAnimal;

import java.util.Random;

public class PetFactory {

    private static Random random = new Random();

    public static Pet next() {
        boolean val = random.nextBoolean();
        if (val)
            return new Dog(8);
        else {
            return new Cat(6);
        }
    }
}







