package HomeWork.HomeWorkAnimal;

public abstract class Animal {
    protected String name;
    protected String species;
    protected int age;

    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public abstract void makeSound();

    public abstract void move();

    public abstract void eat();

    @Override
    public  String toString(){
        return species + " по имени " + name + ", возраст: " + age;
    }

}
