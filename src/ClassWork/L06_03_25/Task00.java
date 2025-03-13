package ClassWork.L06_03_25;

import StudentWork.Student;
import StudentWork.StudentFactory;
import StudentWork.StudentNameComparator;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task00 {
    public static void main(String[] args) {
        Set<Student>students=new HashSet<>();
        LinkedHashSet<Student>studentsList=new LinkedHashSet<>();
        Set<Student>students1= new TreeSet<>(new StudentNameComparator());

        for (int i = 0; i <10 ; i++) {
            Student next=StudentFactory.next();
           // System.out.println(next);
            students.add(next);
            studentsList.add(next);
            students1.add(next);
        }
        System.out.println(students);
        System.out.println(students.size());
        System.out.println("__________________________");
        System.out.println(studentsList);
        System.out.println(studentsList.size());
        System.out.println("____________________________");
        System.out.println(students1);
        System.out.println(students1.size());

    }
}
