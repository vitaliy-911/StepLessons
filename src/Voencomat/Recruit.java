package Voencomat;

public class Recruit {

    String lastName;
    String firstName;
    String middleName;
    boolean valid;
    String diagnosis;
    double visionCoeff;
    boolean flatFeet;
    int implantCount;
    int cardiogram;

    public Recruit(int cardiogram, int implantCount, boolean flatFeet,
                   double visionCoeff, String diagnosis, boolean valid,
                   String middleName, String firstName, String lastName) {
        this.cardiogram = cardiogram;
        this.implantCount = implantCount;
        this.flatFeet = flatFeet;
        this.visionCoeff = visionCoeff;
        this.diagnosis = diagnosis;
        this.valid = valid;
        this.middleName = middleName;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getCardiogram() {
        return cardiogram;
    }


    public int getImplantCount() {
        return implantCount;
    }


    public boolean isFlatFeet() {
        return flatFeet;
    }

    public double getVisionCoeff() {
        return visionCoeff;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    @Override
    public String toString() {
        return "";
    }
}
