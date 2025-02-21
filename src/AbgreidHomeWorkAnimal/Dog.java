package AbgreidHomeWorkAnimal;

public class Dog extends Pet {
    private static String species = " Собака ";

    public Dog(int age) {
        super(species, age);
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public void makeSound() {
        System.out.println("Собака по имени " + name + "говорит : Гав-гав !");
    }

    @Override
    public void move() {
        System.out.println(name + " Бегает на четырех лапках ");
    }

    @Override
    public void eat() {
        System.out.println(name + " ест собачий корм ");
    }

    @Override
    public void play() {
        System.out.println(name + " играет в мяч с " + getOwnerName());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
