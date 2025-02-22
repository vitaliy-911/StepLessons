package HomeWork23;

public class Building {
    String street;
    String material;
    int doors;
    int window;
    int height;
    int yearBuild;

    public Building(String street, String material, int doors, int window) {
        this.street = street;
        this.material = material;
        this.doors = doors;
        this.window = window;
    }

    public Building(String street, String material, int doors, int window, int height, int yearBuild) {
        this.street = street;
        this.material = material;
        this.doors = doors;
        this.window = window;
        this.height = height;
        this.yearBuild = yearBuild;

    }

    public String getDescription() {
        return street + " " + material + " дверей " + doors + " окон " + window + " Высота " + height + " Год постройки " + yearBuild;
    }
}
