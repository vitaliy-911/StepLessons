package StudentWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final List<Student> students = new ArrayList<>();
        final List<Student> students1 = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            students.add(StudentFactory.next());
            students1.add(StudentFactory.next());
        }
        sortArray(students);
        System.out.println(students);


    }

    public Student findStudentName(List<Student> students, String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    static void removeStudentName(List<Student> students, String name) {
        students.removeIf(student -> student.getName().equals(name));
    }

    static void addStudentToList(List<Student> students, List<Student> students1) {
        students1.addAll(students);
    }

    public static void replaceStudentATIndex(List<Student> students, int index, Student student) {
        if (students.size() < index || index < 0) {
            return;
        }
        students.set(index, student);
    }

    private static void sortArray(List<Student> students) {
        Collections.sort(students);
    }
}
