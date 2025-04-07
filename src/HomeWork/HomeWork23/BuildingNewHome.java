package HomeWork.HomeWork23;

import java.util.Arrays;

public class BuildingNewHome {
    String street;
    String material;
    int window;
    int door;
    int height;
    int yearBuild;

    public BuildingNewHome(String street, String material, int window, int door, int height, int yearBuild) {
        this.street = street;
        this.material = material;
        this.window = window;
        this.door = door;
        this.height = height;
        this.yearBuild = yearBuild;
    }
    public String getDescription() {

        return street + " " + material + " дверей " + door + " окон " + window + " Высота " + height + " Год постройки " + yearBuild+"\t";
    }
}
