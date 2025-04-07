package HomeWork.HomeWorkVoenkom;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Doctor[] doctors = {new Dentist(), new Okulist(), new Surgeon(), new Psychiatrist(), new Therapist()};
        Commission commission = new Commission(doctors);
        ArrayRecruits recruits = new ArrayRecruits(1000);
        RecruitGenerator generator = new RecruitGenerator();

        for (int i = 0; i < 1000; i++) {
            Recruit recruit = generator.generate();
            commission.test(recruit);
            recruits.add(recruit);
        }

        ArrayRecruits validRecruits = new ArrayRecruits(0);
        ArrayRecruits invalidRecruits = new ArrayRecruits(0);

        int tottalValid = 0;
        int tottalInValid = 0;

        for (Recruit val : recruits.getRecruits()) {
            if (val.valid) {
                validRecruits.add(val);
                tottalValid++;
            } else {
                invalidRecruits.add(val);
                tottalInValid++;
            }
        }

        System.out.println(" не Годных новобранцев: " + tottalInValid);
        System.out.println(Arrays.toString(invalidRecruits.getRecruits()));
        System.out.println(" годных новобранцев:" + tottalValid);
        System.out.println(Arrays.toString(validRecruits.getRecruits()));

    }
}
