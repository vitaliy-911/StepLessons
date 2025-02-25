package HomeWorkVoenkom;

import java.util.Random;

public class RecruitGenerator {

    private static String[] firsNames = {"Петр", "Сергей", "Глеб", "Влад"};
    private static String[] middleNames = {"Петрович", "Сергеевич", "Олегович", "Степанович"};
    private static String[] lastNames = {"Петров", "Иванов", "Сидоров", "Козлов"};
    private static Random random = new Random();

    public static Recruit generate() {

        String firstName = firsNames[random.nextInt(firsNames.length)];
        String middleName = middleNames[random.nextInt(middleNames.length)];
        String lastName = lastNames[random.nextInt(lastNames.length)];

        int implantCount = random.nextInt(0, 2);
        double visionCoeff = random.nextDouble(0.8, 1.2);
        boolean flatFeet = random.nextBoolean();
        int cardiogram = random.nextInt(90, 200);
        boolean valid = true;

        Recruit recruit= new Recruit(firstName, middleName,lastName, visionCoeff,flatFeet, implantCount,cardiogram,valid);
        return recruit;
    }
}
