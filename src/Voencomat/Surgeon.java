package Voencomat;

public class Surgeon extends Doctor{

    @Override
    public void test(Recruit recruit) {
        if (recruit.isFlatFeet()==true){
            recruit.setValid(false);
            recruit.setDiagnosis(" Наличие плоскостопия ");
        }
    }
}
