package HomeWork.HomeWorkAnimal;

public abstract class Pet extends Animal {

    public String getMaster() {
        return master;
    }

    private String master;

    public Pet(String name, String species, int age, String master) {
        super(name, species, age);
        this.master = master;
    }

    public abstract void makeSound();

    public abstract void move();

    public abstract void eat();

    public abstract void play();

    public String toString() {
        return super.toString() + " Домашнее животное" + ", хозяин: " + master;
    }
}
