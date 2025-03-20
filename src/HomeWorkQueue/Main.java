package HomeWorkQueue;

public class Main {
    public static void main(String[] args) {
        BusStop busStop=new BusStop();
        busStop.addPassenger("Nikolay");
        busStop.addPassenger("David");
        busStop.boardBus();
    }
}
