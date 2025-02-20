package Voencomat;

public class Dantist extends Doctor{
    @Override
    public void test(Recruit recruit) {
        if (recruit.getImplantCount()>1){
            recruit.setValid(false);
            recruit.setDiagnosis(" Много протезов ");
        }
    }
}
