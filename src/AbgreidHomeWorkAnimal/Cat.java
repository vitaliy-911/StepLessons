package AbgreidHomeWorkAnimal;

public class Cat extends Pet {

    private static String species = " Кот ";

    public Cat() {
        super(species);
    }

    @Override
    public void makeSound() {
        System.out.println("Кот по имени " + name + " говорит : Мяу ! ");
    }

    @Override
    public void move() {
        System.out.println(name + " тихо крадется ");
    }

    @Override
    public void play() {
        System.out.println(name + " играет с хозяином " + getOwnerName());
    }

    @Override
    public void eat() {
        System.out.println(name + " ест рыбу ");
    }
}
