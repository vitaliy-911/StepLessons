package AbgreidHomeWorkAnimal;

public abstract class WildAnimal extends Animal {

    private String wildAnimal = "Дикое животное";

    protected String habitab;

    public WildAnimal(String name, String species, int age, String habitab) {
        super(name, species, age);
        this.habitab = habitab;
    }

    public abstract void makeSound();

    public abstract void move();

    public abstract void eat();

    public abstract void hunt();

    public String getWildAnimal() {
        return wildAnimal;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + getWildAnimal() + ", среда обитания ";
    }
}
