package TransportWork3;

public class Main {
    public static void main(String[] args) {
        TransportUserManager transportUserManager = new TransportUserManager();
        User user = UserFactory.next();
        for (int i = 0; i < 10; i++) {
            transportUserManager.addTransport(user,TransportFactory.next(),10);
        }
        transportUserManager.printAllOwnersAndTransport();


    }
}
