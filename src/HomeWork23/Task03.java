package HomeWork23;

import java.util.Random;

public class Task03 {
    public static void main(String[] args) {
        String[] street = {"кирова", "строителей", "чапаева", "лазо", "фрунзе"};
        String[] material = {"бетон", "кирпич", "дерево", "газосиликат"};
        BuildingNewHome[] buildingNewHomes = new BuildingNewHome[200];
        Random value = new Random();

        for (int i = 0; i < buildingNewHomes.length; i++) {
            String randomStreet = street[value.nextInt(street.length)];
            String randomMaterial = material[value.nextInt(material.length)];
            int window = value.nextInt(1, 10);
            int door = value.nextInt(2, 20);
            int height = value.nextInt(1, 100);
            int yearBuild = value.nextInt(1900, 2025);
            buildingNewHomes[i] = new BuildingNewHome(randomStreet, randomMaterial, window, door, height, yearBuild);
        }
        for (BuildingNewHome buildingNewHome : buildingNewHomes) {
            System.out.println(buildingNewHome.getDescription());
        }

        BuildingNewHome result = null;
        for (int i = 0; i < buildingNewHomes.length; i++) {
            if (buildingNewHomes[i].material.equals("бетон") && buildingNewHomes[i].height > 40) {
                if (result == null) {
                    result = buildingNewHomes[i];
                }
                if (result.yearBuild < buildingNewHomes[i].yearBuild) {
                    result = buildingNewHomes[i];
                }
            }
        }
        System.out.println(result.getDescription());

        System.out.println("*********");
        System.out.println(result.getDescription());
    }
}
