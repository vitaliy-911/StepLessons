package HomeWorkVoenkom;

public class Surgeon extends Doctor {

    public void test(Recruit recruit) {
        if (recruit.flatFeet ==true) {
            recruit.setValid(false);
            recruit.setDiagnosis(" плоскостопие ");
        }else {
            recruit.setValid(true);
        }
    }
}

