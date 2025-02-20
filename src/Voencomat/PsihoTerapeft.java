package Voencomat;

import java.util.Random;

public class PsihoTerapeft extends Doctor {
    @Override
    public void test(Recruit recruit) {
        Random val = new Random();
        boolean psi = val.nextBoolean();
        if (psi == false) {
            recruit.setValid(false);
            recruit.setDiagnosis(" Шизофрения ");
        }
    }
}
