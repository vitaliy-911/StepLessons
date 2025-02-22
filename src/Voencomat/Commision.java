package Voencomat;

public class Commision extends Doctor  {
    Doctor[]doctors;

    public Commision(Doctor[] doctors) {
        this.doctors = doctors;
    }

    @Override
    public void test(Recruit recruit) {
        for (Doctor doctor:doctors) {
            doctor.test(recruit);
        }
    }
}
