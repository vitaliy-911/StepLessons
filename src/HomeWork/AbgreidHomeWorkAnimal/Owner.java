package HomeWork.AbgreidHomeWorkAnimal;

import java.util.Random;

public class Owner {
    private int id; //уникальный идентификатор•
    private String name;// имя владельца.
    private String surName;//фамилия владельца.
    private Pet[] pets = new Pet[0];// массив животных которые есть у владельца.

    private static String[] names = new String[5];//массив имен.
    private static String[] surNames = new String[5];// массив фамилий.
    private static int totalOwner = 0;
    private int totalPets = 0;

    private Random random = new Random();

    public Owner() {
        this.id = ++totalOwner;
        this.name = names[random.nextInt(names.length)];
        this.surName = surNames[random.nextInt(surNames.length)];
        this.id = ++totalOwner;
    }

    static {
        System.out.println("Класс Owner загружен в память!");
        surNames[0] = "Петрой";
        surNames[1] = "Кондратенко";
        surNames[2] = "Моисейченко";
        surNames[3] = "Чуйко";
        surNames[4] = "Петрошенко";

        names[0] = "Миша";
        names[1] = "Иванка";
        names[2] = "Света";
        names[3] = "Маша";
        names[4] = "Катя";
    }

    public int getId() {
        return id;
    }

    public static int getTotalOwner() {
        return totalOwner;
    }

    public int getTotalPets() {
        return totalPets;
    }

    public String getFullName() {
        return surName + " " + name;
    }

    public void addPet(Pet pet) {
        Pet[] pets1 = new Pet[pets.length + 1];
        System.arraycopy(pets, 0, pets1, 0, pets.length);
        pets1[pets1.length - 1] = pet;
        pet.setOwner(this);
        ++totalPets;
    }

    @Override
    public String toString() {
        return getFullName() + " : количество питомцев - " + getTotalPets();
    }
}