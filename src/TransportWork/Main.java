package TransportWork;


public class Main {
    public static void main(String[] args) {
        TransportManager manager = new TransportManager();
        for (int i = 0; i < 10; i++) {
            manager.addTransport(TransportFactory.next());
        }
        manager.printAllTransport();
        manager.printUniqueTransport();
        System.out.println("Удаляем");
        manager.removeTransport("BMW");
        manager.printAllTransport();
        manager.printUniqueTransport();
        System.out.println("Сортируем по модели");
        manager.sortTransportByModel();

        manager.printAllTransport();
        System.out.println("Сортируем по скорости");
        manager.sortTransportBySpeed();
        manager.printUniqueTransport();




    }
}
