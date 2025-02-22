package HomeWorkAnimal;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        WildAnimal lion = new Lion("Симба", "Лев", 5, "Африка");
        WildAnimal hyena = new Hyena("Скали", "Гиена", 4, "Азия");

        Pet cat = new Cat("Барсик", "Кот", 6, "Лена");
        Pet dog = new Dog("Жулик", "Собака", 3, "Гриша");

        WildAnimal[] wildAnimals = {lion, hyena};
        Pet[] pets = {cat, dog};

        for (WildAnimal wildAnimal : wildAnimals) {
            System.out.println(wildAnimal.toString());
            wildAnimal.makeSound();
            wildAnimal.move();
            wildAnimal.eat();
            wildAnimal.hunt();
        }

        for (Pet pet : pets) {
            System.out.println(pet.toString());
            pet.makeSound();
            pet.move();
            pet.eat();
            pet.play();
        }
    }
}