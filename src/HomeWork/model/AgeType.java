package HomeWork.model;

public enum AgeType {
    NEW("Новый"),
    AVERAGE("Средний"),
    OLD("Старый");

    AgeType(String rusName) {
        this.rusName = rusName;
    }

    public String getRusName() {
        return rusName;
    }

    private final String rusName;
}
