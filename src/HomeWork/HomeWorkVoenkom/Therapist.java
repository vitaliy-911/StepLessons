package HomeWork.HomeWorkVoenkom;

public class Therapist extends Doctor {

    public void test(Recruit recruit) {
        if (recruit.cardiogram < 60 || recruit.cardiogram > 100) {
            recruit.setValid(false);
            recruit.setDiagnosis(" плохое сердце ");
        }else {
            recruit.setValid(true);
        }
    }
}