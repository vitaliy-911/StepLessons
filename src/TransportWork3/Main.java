package TransportWork3;

public class Main {
    public static void main(String[] args) {
        TransportUserManager transportUserManager = new TransportUserManager();
        for (int i = 0; i < 1; i++) {
            transportUserManager.addTransport(new User("jhg"),TransportFactory.next(),6);
            transportUserManager.addTransport(new User("kjgkjg"),TransportFactory.next(),6);
        }
        transportUserManager.printAllOwnersAndTransport();

    }
}
