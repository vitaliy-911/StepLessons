package HomeWork.HomeWorkGenericsAndExceptionLotto;

import java.util.Objects;

public class Participant {
    private final String name;
    private final int age;
    private final Sex sex;
    int passportId;
    private AgeType ageType;


    public Participant(String name, int age, Sex sex, int passportId) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.passportId = passportId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public int getPassportId() {
        return passportId;
    }

    public AgeType getAgeType() {
        return ageType;
    }

    public void setAgeType(AgeType ageType) {
        this.ageType = ageType;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Participant that = (Participant) o;
        return passportId == that.passportId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(passportId);
    }

    @Override
    public String toString() {
        return "Participant{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", passportId=" + passportId +
                '}';
    }
}
