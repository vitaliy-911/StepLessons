package AbgreidHomeWorkAnimal;

public class Dog extends Pet {
    public Dog(String name, String species, int age) {
        super(name, species, age);
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
