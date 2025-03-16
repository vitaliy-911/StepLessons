package TransportWork3;

public class Main {
    public static void main(String[] args) {
        TransportUserManager transportUserManager = new TransportUserManager();

        for (int i = 0; i < 5; i++) {
            Transport transport=TransportFactory.next();
            User user=UserFactory.next();
            transportUserManager.addTransport(user,transport);
        }
        transportUserManager.printAllOwnersAndTransport();
        //получаем по владельцу список
        transportUserManager.getTransportByOwner(UserFactory.next());
        //удаляем транспорт
        transportUserManager.removeTransport(UserFactory.next(),"2345");
        //получаем самый быстрый
        transportUserManager.getFastestTransportByType(UserFactory.next());
        //у кого больше траспорта
        transportUserManager.UserFindOwnerWithMostCars();

        TransportStatistics transportStatistics=new TransportStatistics();
        for (int i = 0; i <20 ; i++) {
            Transport transport=TransportFactory.next();
            transportStatistics.addTransport(transport);
        }
        transportStatistics.printBrandStatistics();

        TransportSpeedGroopper transportSpeedGroopper=new TransportSpeedGroopper();

        for (int i = 0; i <2000 ; i++) {
            Transport transport=TransportFactory.next();
            transportSpeedGroopper.add(transport);
        }
        transportSpeedGroopper.getTransportBySpeed(120);





    }

}
