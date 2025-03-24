package HomeWorkEnum;

import java.util.*;

public class TicketManager {
    private List<Ticket> soldTickets = new ArrayList<>();

    public void sellTicket(String name, TicketType type) {
        soldTickets.add(new Ticket(name, type));
    }

    public void printAllSales() {
        System.out.println(soldTickets);
    }

    public Map<TicketType, Long> countByType() {
        Map<TicketType, Long> countByType = new EnumMap<>(TicketType.class);

        for (Ticket ticket : soldTickets) {

            if (countByType.containsKey(ticket.getType())) {
                long size = countByType.get(ticket.getType());
                countByType.put(ticket.getType(), ++size);
            } else {

                countByType.put(ticket.getType(), 1L);
            }
        }
        return countByType;
    }

//    int totalRevenue() {
//
//
//    }

}
