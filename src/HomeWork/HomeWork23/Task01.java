package HomeWork.HomeWork23;

import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        Building[] buildings = new Building[20];
        Random value = new Random();

        for (int i = 0; i < buildings.length; i++) {
            int window = value.nextInt(1,20);
            int doors = value.nextInt(1,20);
            int height=value.nextInt(1,50);
            int yearBuilt = value.nextInt(1900,2023);
            buildings[i] = new Building("Ленина", "Кирпич", doors,window,height,yearBuilt);
        }

        for (int i = 0; i < buildings.length; i++) {
            if (buildings[i].window == 10) {
                buildings[i].material = "Дерево";
            }
        }

        for (Building building : buildings){
            System.out.println(building.getDescription());
        }
    }
}
