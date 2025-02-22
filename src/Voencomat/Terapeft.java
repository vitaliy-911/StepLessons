package Voencomat;

public class Terapeft extends Doctor {
    @Override
    public void test(Recruit recruit) {
        if (recruit.getCardiogram() < 60 || recruit.getCardiogram() > 100) {
            recruit.setValid(false);
            recruit.setDiagnosis(" Проблемы с сердцем ");
        }
    }
}
