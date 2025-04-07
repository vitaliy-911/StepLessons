package HomeWork.HomeWorkEnum;

public class Main {
    public static void main(String[] args) {

        TicketManager ticketManager=new TicketManager();

        System.out.println(ticketManager.getAllDiscountedPrices(DayOfWeek.FRIDAY));
        System.out.println(ticketManager.getDiscountedPrise(TicketType.VIP,DayOfWeek.SUNDAY));
    }
}
