package TransportWork2;

import java.util.*;

public class TransportManager {

    private static Map<String, Transport> transportByPlate = new HashMap<>();
    private static Map<String, List<Transport>> transportByType = new HashMap<>();

    void addTransport1(Transport transport) {
        transportByPlate.put(transport.getLicensePlate(),transport);
        List<Transport>newTran=new ArrayList<>();
        newTran.add(transport);
        transportByType.putIfAbsent(transport.getClass().getSimpleName(), newTran);

    }

    void removeTransport1(String model) {
        transportByPlate.remove(model);
        if (model != null) {

        }
    }
    void printAllTransport1(){
        System.out.println(transportByPlate);
        System.out.println(transportByType);
    }
    void print2(){

    }


}
