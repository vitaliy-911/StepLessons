package Voencomat;

import java.util.Random;

public class RecruitGenerator {

    private String[] firsNames = {"Петр", "Сергей", "Глеб", "Влад"};
    private String[] middleNames = {"Петрович", "Сергеевич", "Олегович", "Степанович"};
    private String[] lastNames = {"Петров", "Иванов", "Сидоров", "Козлов"};
    Random random = new Random();


    public Recruit generate(Recruit recruit){

        recruit.firstName=firsNames[random.nextInt(firsNames.length)];
        recruit.middleName=middleNames[random.nextInt(middleNames.length)];
        recruit.lastName=lastNames[random.nextInt(lastNames.length)];
        recruit.setValid(true);
        recruit.cardiogram=random.nextInt(80,250);
        recruit.flatFeet=random.nextBoolean();
        recruit.implantCount=random.nextInt(0,1);
        recruit.visionCoeff=random.nextDouble(0.7,1.3);
        return recruit;
    }
}
