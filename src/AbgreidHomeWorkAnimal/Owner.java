package AbgreidHomeWorkAnimal;

import java.util.Random;

public class Owner {
    private int id; //уникальный идентификатор•
    private String name;// имя владельца.
    private String surName;//фамилия владельца.
    private Pet[] pets = new Pet[0];// массив животных которые есть у владельца.
    private static int totalOwners;

    private static String[] names = new String[5];//массив имен.
    private static String[] surNames = new String[5];// массив фамилий.
    private static int totalOwner = 0;

    private Random random = new Random();

    public Owner() {
        this.id = ++totalOwner;
        this.name = names[random.nextInt(names.length)];
        this.surName = surNames[random.nextInt(surNames.length)];
    }//общее количество владельцев .

    static {
        System.out.println("Класс Owner загружен в память!");
        surNames[0] = "Петрой";
        surNames[1] = "Ивано";
        surNames[2] = "Сидорой";
        surNames[3] = "Моисей";
        surNames[4] = "Козлой";

        names[0] = "Лера";
        names[1] = "Иванка";
        names[2] = "Света";
        names[3] = "Маша";
        names[4] = "Катя";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pet[] getPets() {
        return pets;
    }

    public void setPets(Pet[] pets) {
        this.pets = pets;
    }

    public static String[] getNames() {
        return names;
    }

    public static void setNames(String[] names) {
        Owner.names = names;
    }

    public static String[] getSurNames() {
        return surNames;
    }

    public static void setSurNames(String[] surNames) {
        Owner.surNames = surNames;
    }

    public void getTotalOwners() {

    }

    public String getFullName() {
        return surName + " " + name;
    }

    public void addPet(Pet pet) {
        //у нас есть одноменый массив и внего приходит животное
        //второе животное класть некуда
        //создаем новый массив
        //длинной больше старого
        Pet[] pets1=new Pet[pets.length + 1];

              //старый массив ,начало , новый массив ,начало , сколко от старого
        System.arraycopy(pets,0,pets1,0,pets.length);
        //здесь мы копируем старый массив в новый
        //но мы знаем что он заполнен не полностью
        //и кладем второго зверя
        pets1[pets1.length-1] = pet;
        //для разяснения длинна его 2,но индексы 0 и 1 и поэтому
        //его место будет длинна нового -1,что и по индексу и есть 1
        pet.setOwner(this);

    }

}
