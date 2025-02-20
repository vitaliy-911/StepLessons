package HomeWorkVoenkom;

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

        // recruits.sortByLastName();

        ArrayRecruits validRecruits = new ArrayRecruits(0);
        ArrayRecruits invalidRecruits = new ArrayRecruits(0);

//        for (int i = 0; i < recruits.getSize(); i++) {
//            Recruit recruit = recruits.get(i);
//            if (recruit.valid == true) {
//                validRecruits.add(recruits.get(i));
//            } else {
//                invalidRecruits.add(recruits.get(i));
//            }
//        }
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
