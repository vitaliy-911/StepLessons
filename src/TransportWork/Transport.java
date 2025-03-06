package TransportWork;

import java.util.Objects;

public abstract class Transport {
    private String model;
    private int speed;

    public Transport(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(model);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }
}
