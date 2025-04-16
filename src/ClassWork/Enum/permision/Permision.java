package ClassWork.Enum.permision;

public enum Permision {
    READ("Чтение"),
    WRITE("Запись"),
    DELETE("Удаление"),
    EXECUTE("Выполнение");

  private final String descriptoion;

    public String getDescriptoion() {
        return descriptoion;
    }

    Permision(String descriptoion) {
        this.descriptoion = descriptoion;
    }
}
