package AbgreidHomeWorkAnimal;


import java.util.Random;

public abstract class Pet extends Animal {

    private Owner owner;
    private String pet = "Домашнее животное";
    private static Random random = new Random();
    private static String[] names = {"Жулик", "Борик", "Кизя", "Рубик", "Черныш"};


    public Pet(String name, String species, int age) {
        super(name, species, age);
    }

    public Pet(String species, int age) {
        super(names[random.nextInt(names.length - 1)], species, age);
    }

    public abstract void makeSound();

    public abstract void move();

    public abstract void eat();

    public abstract void play();

    public String getPet() {
        return pet;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getOwnerName() {

        if (owner == null) {
            return "Без хозяина";
        } else {
            return owner.getFullName();
        }
    }

//    public String toString() {
//        return this. +" хозяин :" ;
//    }
}
