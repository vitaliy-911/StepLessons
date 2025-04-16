package HomeWork.HomeWork23;

import java.util.Random;

public class Task02 {


    public static void main(String[] args) {
        BuildingHome[] building = new BuildingHome[200];
        Random value = new Random();

        for (int i = 0; i < building.length; i++) {
            int door = value.nextInt(2, 10);
            int windows = value.nextInt(1, 20);
            int height = value.nextInt(1, 50);
            int yearBuild = value.nextInt(1900, 2023);
            building[i] = new BuildingHome("Кирова", "Кирпич", windows, door, height, yearBuild);
        }
        for (int i = 0; i < building.length; i++) {
            System.out.println(building[i].getDescription());
        }
        BuildingHome maxHeight = building[0];
        for (BuildingHome buildingHome : building) {
            if (buildingHome.height < maxHeight.height) {
                maxHeight.height = buildingHome.height;
            }
        }
        System.out.println(" самое высокое здание " + maxHeight.getDescription());

        BuildingHome oldHouse = building[0];
        for (BuildingHome buildingHome : building) {
            if (buildingHome.yearBuild < oldHouse.yearBuild) {
                oldHouse.yearBuild = buildingHome.yearBuild;
            }
        }

        System.out.println(" самое старое здание " + oldHouse.getDescription());

    }
}
