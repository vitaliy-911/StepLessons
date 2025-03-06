package StudentWork;

public class Student implements Comparable<Student> {

    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {

        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        int nameCompare = this.name.compareTo(o.name);
        if (nameCompare != 0) {
            return nameCompare;
        }
        return Integer.compare(this.age,o.age);
    }

    @Override
    public String toString() {
        return name + " " + age + " " + grade;

    }
}
