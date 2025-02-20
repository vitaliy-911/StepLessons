package HomeWorkVoenkom;

public class Recruit {

     static int idCounter = 0;
     int id;
     String firstName;
     String middleName;
     String lastName;
     boolean valid;
     String diagnosis;
     double visionCoeff;
     boolean flatFeet;
     int implantCount;
     int cardiogram;

    public Recruit(String firstName, String middleName, String lastName, double visionCoeff, boolean flatFeet, int implantCount, int cardiogram, boolean valid) {
        this.id = ++idCounter;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.visionCoeff = visionCoeff;
        this.flatFeet = flatFeet;
        this.implantCount = implantCount;
        this.cardiogram = cardiogram;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public double getVisionCoeff() {
        return visionCoeff;
    }

    public boolean hasFlatFeet() {
        return flatFeet;
    }

    public int getImplantCount() {
        return implantCount;
    }

    public int getCardiogram() {
        return cardiogram;
    }

    public String toString() {
        return firstName + " " + middleName + " " + lastName + " — " + (valid ? "годен + \n": "не годен (" + diagnosis + ")");
    }
}