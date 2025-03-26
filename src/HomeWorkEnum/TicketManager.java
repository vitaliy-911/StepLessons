package HomeWorkEnum;

import java.util.HashMap;
import java.util.Map;


public class TicketManager {

    public int getDiscountedPrise(TicketType type, DayOfWeek day) {
        int discount = type.getBasePrise() / 100 * day.getDiscountPercent();
        return type.getBasePrise() - discount;

    }

    public Map<TicketType, Integer> getAllDiscountedPrices(DayOfWeek day) {
        Map<TicketType, Integer> getAllDiscountedPrices = new HashMap<>();
        for (TicketType type : TicketType.values()) {
            int discount = type.getBasePrise() / 100 * day.getDiscountPercent();
            getAllDiscountedPrices.put(type, type.getBasePrise() - discount);
        }
        return getAllDiscountedPrices;
    }
}
