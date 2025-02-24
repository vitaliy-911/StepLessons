package AbgreidHomeWorkAnimal;

import java.util.Random;

public abstract class Pet extends Animal {

    private Owner owner;
    private static Random random = new Random();
    private static String[] names = {"Жулик", "Борик", "Кизя", "Рубик", "Черныш", "Васька"};

    public Pet(String species) {
        super(names[random.nextInt(names.length - 1)], species, random.nextInt(2, 8));
    }

    public abstract void play();

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getOwnerName() {
        if (owner == null) {
            return "Без хозяина";
        } else {
            return owner.getFullName();
        }
    }

}
