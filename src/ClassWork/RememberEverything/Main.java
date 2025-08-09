package ClassWork.RememberEverything;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 20, 8.8);
        Student student2 = new Student("Gek", 35, 7.8);
        Student student3 = new Student("Nikol", 19, 6.9);
        Student student4 = new Student("Poly", 18, 5.8);
        Student student5 = new Student("Harry", 25, 8.9);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);


         students.stream().
                filter(student -> student.getAge() > 20)
                .sorted(Comparator.comparing(Student::getGrade))
                .map(student -> ("Имя: "+student.getName() +" возраст: "+ student.getAge() +" средний бал: "+ student.getGrade()))
                .forEach(System.out::println);





    }


}
