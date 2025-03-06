package StudentWork;

import java.util.*;

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
        sortBYcomporator(students1,new StudentNameComparator());
        System.out.println(students1);




    }

    private static void sortBYcomporator(List<Student> students1, Comparator <Student>comparator) {
        students1.sort(comparator);

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
