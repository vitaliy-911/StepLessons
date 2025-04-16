package HomeWork.HomeWorkAnimal;

public class Bird extends Animal {

    public Bird(String name, String species, int age) {
        super(name, species, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " чирикает: Чик-Чирик! ");
    }

    @Override
    public void move() {
        System.out.println(name + " летает в небе.");
    }

    @Override
    public void eat() {
        System.out.println(name + " клюет зерна.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
