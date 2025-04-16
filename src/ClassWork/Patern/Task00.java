package ClassWork.Patern;

public class Task00 {
    public static void main(String[] args) {
        SingletonExample singletonExample = SingletonExample.getInstance();
        SingletonExample singletonExample2 = SingletonExample.getInstance();
//
        Student student = new Student.Builder("Дима")
                .age(35)
                .email("мыло")
                .build();


        StudentService studentService = new StudentServiceImpl();
        StudentService studentServiceLogging = new LoggingServiceDecorator(studentService);

        test(studentService);
        test(studentServiceLogging);

    }

    private static void test(StudentService studentService) {
        studentService.printAll();

    }
}
