package HomeWorkVoenkom;

import java.util.Random;

public class Psychiatrist extends Doctor {
    private static final Random random = new Random();

    public void test(Recruit recruit) {

        recruit.setValid(random.nextBoolean());
        if (!recruit.isValid() ) {
            recruit.setDiagnosis("Шиза");
        } else {
            recruit.setValid(true);
        }
    }
}

