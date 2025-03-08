package TransportWork;

public class Main {
    public static void main(String[] args) {
        TransportManager transportManager=new TransportManager();
        for (int i = 0; i <10 ; i++) {
            transportManager.addTransport(TransportFactory.next());

        }
        System.out.println(TransportManager.transportList);
        transportManager.removeTransport("BMW");
        System.out.println(TransportManager.transportList);
        System.out.println("______________");

    }
}
