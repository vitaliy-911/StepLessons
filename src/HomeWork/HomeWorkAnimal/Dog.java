package HomeWork.HomeWorkAnimal;

public class Dog extends Pet {
    public Dog(String name, String species, int age, String master) {
        super(name, species, age, master);
    }

    @Override
    public void makeSound() {
        System.out.println("Собака по имени " + name + " говорит: Гав-гав !");
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
        System.out.println(name + " играет в мяч с " + getMaster());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
