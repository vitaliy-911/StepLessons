package ClassWork.Patern;

public class LoggingServiceDecorator implements StudentService{

    private final StudentService delegate;

    public LoggingServiceDecorator(StudentService delegate) {
        this.delegate = delegate;
    }

    @Override
    public void enroll(String name) {
        System.out.println("[LOG] вызов метода enroll");
        delegate.enroll(name);
        System.out.println("[LOG] окончание метода enroll");
    }

    @Override
    public void printAll() {
        System.out.println("[LOG] вызов метода printAll");
        delegate.printAll();

    }
}
