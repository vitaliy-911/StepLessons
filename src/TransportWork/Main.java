package TransportWork;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TransportManager transportManager=new TransportManager();
        for (int i = 0; i <10 ; i++) {
            transportManager.addTransport(TransportFactory.next());

        }

        System.out.println(TransportManager.transportList);
        System.out.println("_________________");
        System.out.println(TransportManager.transportList);
        System.out.println("___________");
        System.out.println(TransportManager.uniqueTransportSet);

    }
}
