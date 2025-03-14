package TransportWork2;

public class Main {
    public static void main(String[] args) {
        TransportManager manager = new TransportManager();

        for (int i = 0; i < 20; i++) {
            manager.addTransport(TransportFactory.next());
        }
        manager.printAllTransport();





    }
}
