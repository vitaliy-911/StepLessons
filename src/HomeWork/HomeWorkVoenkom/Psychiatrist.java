package HomeWork.HomeWorkVoenkom;

import java.util.Random;

public class Psychiatrist extends Doctor {

    public void test(Recruit recruit) {
        Random random = new Random();
        recruit.valid = (random.nextBoolean());
        if (recruit.valid == false) {
            recruit.setDiagnosis("Шиза");
        } else {
            recruit.valid = true;
        }
    }
}

