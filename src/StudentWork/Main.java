package StudentWork;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            students.add(StudentFactory.next());
        }


    }  public static void findStudentName(List<Student> students, String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                System.out.println(student);
            }
            System.out.println("Такого студента нет");
            break;
        }
    }

    public static void removeStudentName(List<Student> students, String name) {
        students.removeIf(student -> student.getName().equals(name));
    }

    public static void addStudentToList(List<Student> students, List<Student> students1) {
        students1.addAll(students);
    }

    public static void replaceStudentATIndex(List<Student> students, int index) {
        students.set(index, StudentFactory.next());
    }
}
