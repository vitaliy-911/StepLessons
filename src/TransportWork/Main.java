package TransportWork;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i <10 ; i++) {
            TransportManager.manager.addTransport(TransportFactory.next());
            TransportManager.manager.removeTransport("NISSAN");
        }

       TransportManager.manager.printAllTransport();
        TransportManager.manager.printUniqueTransport();

        TransportManager.manager.sortTransportByModel();
        TransportManager.manager.printAllTransport();
        TransportManager.manager.sortTransportBySpeed();
        TransportManager.manager.printAllTransport();

    }
}
