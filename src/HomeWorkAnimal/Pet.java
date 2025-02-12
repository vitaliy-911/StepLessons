package HomeWorkAnimal;

public abstract class Pet extends Animal {

    private String pet = "Домашнее животное";
    protected String master;

    public Pet(String name, String species, int age, String master) {
        super(name, species, age);
        this.master = master;
    }

    public abstract void makeSound();

    public abstract void move();

    public abstract void eat();

    public abstract void play();

    public String getPet() {
        return pet;
    }

    public String toString() {
        return super.toString() + getPet() + ", хозяин :" + master;
    }
}
