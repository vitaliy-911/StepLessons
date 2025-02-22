package myWork;

public class Transport {

    public float speed;
    int weight;
    public String color;
    public byte[] coordinate;

    public void setValues(float speed, int weight, String color, byte[] coordinate) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }

    public String getValues() {
        String info = speed + " " + weight + " " + color;
        String infoCoordinate = "Coordinate:\n";
        for (int i = 0; i < coordinate.length; i++) {
            infoCoordinate += coordinate[i] + "\n";
        }
        return info +infoCoordinate;
    }
}
