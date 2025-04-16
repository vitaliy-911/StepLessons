package HomeWork.HomeWorkVoenkom;

public class Commission extends Doctor {

    private Doctor[] doctors;

    public Commission(Doctor[] doctors) {
        this.doctors = doctors;
    }

    public void test(Recruit recruit) {
        for (Doctor doctor : doctors) {
            doctor.test(recruit);
            if (!recruit.isValid()) {
                break;
            }
        }
    }
}
