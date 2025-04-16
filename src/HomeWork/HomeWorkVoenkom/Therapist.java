package HomeWork.HomeWorkVoenkom;

public class Therapist extends Doctor {

    public void test(Recruit recruit) {
        if (recruit.getCardiogram() < 60 || recruit.getCardiogram() > 100) {
            recruit.setValid(false);
            recruit.setDiagnosis(" плохое сердце ");
        }else {
            recruit.setValid(true);
        }
    }
}