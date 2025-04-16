package HomeWork.HomeWorkAnimal;

public class Cat extends Pet {

    public Cat(String name, String species, int age, String master) {
        super(name, species, age, master);
    }

    @Override
    public void makeSound() {
        System.out.println("Кот по имени " + name + " говорит: Мяу!");
    }

    @Override
    public void move() {
        System.out.println(name + " тихо крадется ");
    }

    @Override
    public void play() {
        System.out.println(name + " играет с хозяином " + getMaster());
    }

    @Override
    public void eat() {
        System.out.println(name + " ест рыбу ");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
