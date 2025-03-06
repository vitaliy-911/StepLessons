package StudentWork;

public class Student {

    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {

        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }

    public String getName() {
        return name;
    }
}
