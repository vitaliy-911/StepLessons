package AbgreidHomeWorkAnimal;

public class Main {
    public static void main(String[] args) {

        WildAnimal lion = new Lion("Симба", "Лев", 5, "Африка");
        WildAnimal hyena = new Hyena("Скали", "Гиена", 4, "Азия");

        Pet cat = new Cat("Симба", "Кот", 3);
        Pet dog = new Dog("Жулик", "Собака", 3);
        Pet dog1 = new Dog("Кеша", "Собака", 3);
        Pet cat1 = new Cat("Симба", "Кот", 4);

        Owner owner = new Owner();
        Owner owner1 = new Owner();


        owner.addPet(cat);
        owner1.addPet(dog);
        owner1.addPet(dog1);
        owner.addPet(cat1);


        WildAnimal[] wildAnimals = {lion, hyena};
        Pet[] pets = {cat, dog,cat1,dog1};

//        for (WildAnimal wildAnimal : wildAnimals) {
//            System.out.println(wildAnimal.toString());
//            wildAnimal.makeSound();
//            wildAnimal.move();
//            wildAnimal.eat();
//            wildAnimal.hunt();
//            System.out.println();
//        }

        for (Pet pet : pets) {
            System.out.println(pet.toString());
            pet.makeSound();
            pet.move();
            pet.eat();
            pet.play();
            System.out.println();
        }
        System.out.println("Общее количество животных " + Animal.getTotalAnimals());
    }
}