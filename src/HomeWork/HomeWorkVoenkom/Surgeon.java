package HomeWork.HomeWorkVoenkom;

public class Surgeon extends Doctor {

    public void test(Recruit recruit) {
        if (!recruit.isValid() ) {
            recruit.setValid(false);
            recruit.setDiagnosis(" плоскостопие ");
        }else {
            recruit.setValid(true);
        }
    }
}

