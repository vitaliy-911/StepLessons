package ClassWork.L10_03_25;

import StudentWork.Student;
import StudentWork.StudentFactory;

import java.util.*;

public class Task00 {
    public static void main(String[] args) {
         Student student1 = new Student("Дима",22,7);
        Student student2 = new Student("катя",25,8);
        Student student3 = new Student("Петя",25,4);
        Map<Integer,Student>mapGradeToStudent=new HashMap<>();
        mapGradeToStudent.put(student1.getAge(),student1);
        mapGradeToStudent.put(student2.getAge(),student2);
        mapGradeToStudent.putIfAbsent(student3.getAge(),student3);
        Student student=mapGradeToStudent.get(22);
        boolean containsStudent2= mapGradeToStudent.containsValue(student2);
        Set<Integer>age=mapGradeToStudent.keySet();
        Collection<Student>values=mapGradeToStudent.values();

        for (Map.Entry<Integer,Student>entry:mapGradeToStudent.entrySet()){
            Student value=entry.getValue();
            Integer key= entry.getKey();
            System.out.println(key);
            System.out.println(value);
        }
        mapGradeToStudent.getOrDefault(90,new Student("sdf",12,2));
        mapGradeToStudent.remove(34);

        Map<Integer, List<Student>>ageStudentsMap=new HashMap<>();
        List<Student>students=new ArrayList<>();
        students.add(student1);
        ageStudentsMap.put(student1.getAge(),students);
        List<Student>students1=ageStudentsMap.get(student1.getAge());
        students1.add(student2);

        List<Student>studentsList=List.of(student1,student2,student3);

        for (Student s:studentsList) {
            ageStudentsMap.putIfAbsent(s.getAge(),new ArrayList<>());
            List<Student>list=ageStudentsMap.get(s.getAge());
            list.add(s);

        }
        System.out.println(ageStudentsMap);
        String simplenama=student1.getClass().getSimpleName();
        System.out.println(simplenama);


//        System.out.println(age);
//        System.out.println(student);


    }
}
