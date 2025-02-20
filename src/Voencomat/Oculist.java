package Voencomat;

public class Oculist extends Doctor {
    @Override
    public void test(Recruit recruit) {
        if (recruit.getVisionCoeff()<0.8||recruit.getVisionCoeff()>1.2){
            recruit.setValid(false);
            recruit.setDiagnosis(" Плохое зрение ");
        }
    }
}
