package HomeWork.AbgreidHomeWorkAnimal;

public class Hyena extends WildAnimal {
    public Hyena(String name, String species, int age, String habitab) {
        super(name, species, age, habitab);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " рычит : Pppp! ");
    }

    @Override
    public void move() {
        System.out.println(name + " быстро бегает по саванне ");
    }

    @Override
    public void eat() {
        System.out.println(name + " ест мясо ");
    }

    @Override
    public void hunt() {
        System.out.println(name + " охотится в Африке ");
    }

    @Override
    public String toString() {
        return super.toString() + habitab + ")";
    }
}
