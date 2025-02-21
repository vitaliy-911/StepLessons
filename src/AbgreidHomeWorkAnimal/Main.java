package AbgreidHomeWorkAnimal;

public class Main {
    public static void main(String[] args) {

        WildAnimal lion = new Lion("Симба", "Лев", 5, "Африка");
        WildAnimal hyena = new Hyena("Скали", "Гиена", 4, "Азия");


        Pet dog = new Dog(12);
        Pet dog1 = new Dog( 3);
        Pet cat1 = new Cat( 4);
        Dog dog2=new Dog(8);

        Owner owner = new Owner();
        Owner owner1 = new Owner();

        owner1.addPet(dog);
        owner1.addPet(dog1);
        owner.addPet(cat1);


        WildAnimal[] wildAnimals = {lion, hyena};
        Pet[] pets = { dog,cat1,dog1};

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


        for (int i = 1; i <200 ; i++) {
            Pet pet = PetFactory.next();
            System.out.println(pet);
        }


    }
}