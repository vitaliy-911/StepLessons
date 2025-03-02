package Devaces;

import java.util.Objects;

public  class Devace implements Cloneable {

    private final String serialNumber;
    private String model;
    private static int totalDevices = 0;
    protected int batteryLevel;

    public Devace(String serialNumber, String model, int batteryLevel) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.totalDevices++;
        this.batteryLevel = batteryLevel;
    }

    public final String getSerialNumber(String serialNumber) {
        return serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Devace devace = (Devace) o;
        return Objects.equals(serialNumber, devace.serialNumber);
    }

    public int getTotalDevices() {
        return totalDevices;
    }

    @Override
    public Devace clone() {
        return new Devace(getSerialNumber(serialNumber), model, batteryLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getSerialNumber(serialNumber));

    }

    @Override
    public String toString() {
        return "Устройство " + model + " Серийный номер " + getSerialNumber(serialNumber);
    }
}
