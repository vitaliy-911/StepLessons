package HomeWork.HomeWorkEnum;

public enum TicketType {
    VIP(1000,"Вип"),
    STANDARD(500,"Стандарт"),
    STUDENT(250,"Студент");

    private final int basePrise;
    private final String description;

    TicketType(int basePrise, String description) {
        this.basePrise = basePrise;
        this.description = description;
    }

    public int getBasePrise() {
        return basePrise;
    }

    public String getDescription() {
        return description;
    }
}
