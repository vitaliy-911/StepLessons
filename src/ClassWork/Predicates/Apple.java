package ClassWork.Predicates;

public class Apple {

    private int waight;
    private Color color;

    public Apple(int waight, Color color) {

        this.waight = waight;
        this.color = color;
    }

    public int getWaight() {
        return waight;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "waight=" + waight +
                ", color='" + color + '\'' +
                '}';
    }
}
