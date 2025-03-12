package TransportWork2;


public class Main {
    public static void main(String[] args) {
        TransportManager manager = new TransportManager();
        for (int i = 0; i < 10; i++) {
            manager.addTransport1(TransportFactory.next());
        }
        manager.printAllTransport1();
        manager.removeTransport1("NISSAN");
        System.out.println("____________");
        manager.printAllTransport1();

    }
}
