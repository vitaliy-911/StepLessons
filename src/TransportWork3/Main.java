package TransportWork3;

import TransportWork3.factory.TransportFactory;
import TransportWork3.model.Transport;
import TransportWork3.model.User;
import TransportWork3.factory.UserFactory;
import TransportWork3.manager.TransportUserManager;

public class Main {
    public static void main(String[] args) {
        TransportUserManager transportUserManager = new TransportUserManager();
//        User user = UserFactory.next();
//        Transport transport = TransportFactory.next();

        for (int i = 0; i < 5; i++) {
            Transport transport = TransportFactory.next();
            User user = UserFactory.next();
            transport.setUser(user);
            transportUserManager.addTransport( transport);
        }
        transportUserManager.printAllOwnersAndTransport();
        //получаем по владельцу список
        transportUserManager.getTransportByOwner(UserFactory.next());
        //удаляем транспорт
        transportUserManager.removeTransport(UserFactory.next(), "2345");
        //получаем самый быстрый
        transportUserManager.getFastestTransportByType(UserFactory.next());
        //у кого больше траспорта
        transportUserManager.UserFindOwnerWithMostCars();

//        TransportStatistics transportStatistics = new TransportStatistics();
//        for (int i = 0; i < 20; i++) {
//            transportStatistics.addTransport(transport);
//        }
//        transportStatistics.printBrandStatistics();
//
//        TransportSpeedGroopper transportSpeedGroopper = new TransportSpeedGroopper();
//        for (int i = 0; i < 20; i++) {
//            transportSpeedGroopper.add(transport);
//        }
//        transportSpeedGroopper.getTransportBySpeed(120);
//
//        GroupBySpeedRange groupBySpeedRange = new GroupBySpeedRange();
//
//        for (int i = 0; i < 20; i++) {
//            Transport transport1 = TransportFactory.next();
//            groupBySpeedRange.addByEnum(transport1);
//
//        }
//
//
   }

}
