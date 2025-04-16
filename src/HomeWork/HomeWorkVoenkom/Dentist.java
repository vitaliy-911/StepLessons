package HomeWork.HomeWorkVoenkom;

public class Dentist extends Doctor {

    public void test(Recruit recruit) {
        if (recruit.getImplantCount() > 1) {
            recruit.setValid(false);
            recruit.setDiagnosis("Много протезов");
        } else {
            recruit.setValid(true);
        }
    }
}

