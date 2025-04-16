package HomeWork.HomeWorkQueue;

public class Main {
    public static void main(String[] args) {
        BusStop busStop = new BusStop();
        busStop.addPassenger("Nikolay");
        busStop.addPassenger("David");
        busStop.addPassenger("Martin");
        busStop.boardBus();
        busStop.getQueueSize();
        busStop.peekNextPassenger();

        Elevator elevator = new Elevator(4);
        elevator.enter("Poly");
        elevator.enter("Katy");
        elevator.enter("Liza");
        elevator.enter("Pol");
        elevator.enter("Garry");
        elevator.getCurrentPassengers();
        elevator.exit();
        elevator.getCurrentPassengers();
        elevator.peekNextToExit();
        elevator.isFull();

    }
}
