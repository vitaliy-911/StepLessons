package AbgreidHomeWorkAnimal;

public abstract class WildAnimal extends Animal {

    private String wildAnimal = "Дикое животное";

    protected String habitab;

    public WildAnimal(String name, String species, int age, String habitab) {
        super(name, species, age);
        this.habitab = habitab;
    }

    public abstract void hunt();

    @Override
    public String toString() {
        return super.toString() + " (" + wildAnimal + ", среда обитания ";
    }
}
