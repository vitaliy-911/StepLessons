package ClassWork.Predicates;

public class Apple {

    private Integer waight;
    private Color color;

    public Apple() {

    }

    public Apple(Integer waight, Color color) {

        this.waight = waight;
        this.color = color;
    }


    public Integer getWaight() {
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
