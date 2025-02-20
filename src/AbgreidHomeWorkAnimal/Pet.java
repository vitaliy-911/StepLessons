package AbgreidHomeWorkAnimal;

public abstract class Pet extends Animal {

   private Owner owner;

    private String pet = "Домашнее животное";

    public Pet(String name, String species, int age) {
        super(name, species, age);

    }

    public abstract void makeSound();

    public abstract void move();

    public abstract void eat();

    public abstract void play();

    public String getPet() {
        return pet;
    }

    public void setOwner(Owner owner) {
        this.owner=owner;
    }

    public String getOwnerName() {

        if (owner == null) {
            return "Без хозяина";
        } else {
            return owner.getFullName();
        }
    }

    public String toString() {
        return super.toString() + getPet() + ", хозяин :" + getOwnerName();
    }
}
