package HomeWorkEnum;

import java.util.*;

public class TicketManager {
    private final List<Ticket> soldTickets = new ArrayList<>();

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

    public int totalRevenue() {
        int totalRevenue = 0;

        for (Ticket ticket : soldTickets) {
            TicketType type = ticket.getType();
            totalRevenue += type.getPrice();
        }
        return totalRevenue;
    }

    public Set<String> getVIPBuyers() {
        Set<String> vipBuyers = new HashSet<>();
        for (Ticket ticket : soldTickets) {
            if (ticket.getType() == TicketType.VIP) {
                vipBuyers.add(ticket.getBuyerName());
            }
        }
        return vipBuyers;
    }

}
