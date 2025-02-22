package ClassWork.L30_01_25;

public class Wheel {
    String type;
    int diametr;
    String material;

    public Wheel(String wheelType, int diametr, String material) {
        this.type = wheelType;
        this.diametr = diametr;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "type='" + type + '\'' +
                ", diametr=" + diametr +
                ", material='" + material + '\'' +
                '}';
    }
}
