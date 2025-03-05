package StudentWork;

public class Student {

    private final String name;
    private final int age;
    private final double grade;

    public Student(String name, int age, double grade) {

        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " Возраст " + age + " Средний балл " + grade;

    }
}
