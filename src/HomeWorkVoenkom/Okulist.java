package HomeWorkVoenkom;

public class Okulist extends Doctor {

    public void test(Recruit recruit) {
        if (recruit.getVisionCoeff() < 0.8 || recruit.getVisionCoeff() > 1.2) {
            recruit.setValid(false);
            recruit.diagnosis = "Плохое зрение";
        } else {
            recruit.setValid(true);
        }
    }
}

