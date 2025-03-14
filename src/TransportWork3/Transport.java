package TransportWork3;

import java.util.Objects;

public abstract class Transport implements Comparable<Transport> {

    private final String model;
    private final int speed;
    private final String licensePlate;
    private final int year;
    private User user;

    public Transport(String model, int speed, String licensePlate, int year) {
        this.model = model;
        this.speed = speed;
        this.licensePlate = licensePlate;
        this.year = year;
    }

    public User getUser() {
        return user;
    }

    public void setUser() {
        this.user = user;
    }

    public int getYear() {
        return year;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public int compareTo(Transport o) {
        int nameCompare = this.model.compareTo(o.model);
        if (nameCompare != 0) {
            return nameCompare;
        }
        return Integer.compare(this.speed, o.speed);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(licensePlate, transport.licensePlate);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(licensePlate);
    }

    @Override
    public String toString() {
        return model + " Скорость " + speed +
                " Номерной знак " + licensePlate + "год выпуска" + year;
    }
}
