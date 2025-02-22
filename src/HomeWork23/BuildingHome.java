package HomeWork23;

public class BuildingHome {
    String street;
    String material;
    int windows;
    int door;
    int height;
    int yearBuild;

    public BuildingHome(String street, String material, int windows, int door, int height, int yearBuild) {
        this.street = street;
        this.material = material;
        this.windows = windows;
        this.door = door;
        this.height = height;
        this.yearBuild = yearBuild;
    }

    public String getDescription() {
        return street +" "+ material +" окна "+ windows +" двери "+ door +" высота "+ height +" год постройки "+ yearBuild;
    }
}
