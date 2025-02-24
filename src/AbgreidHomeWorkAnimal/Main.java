package AbgreidHomeWorkAnimal;

public class Main {

    public static void main(String[] args) {
        Owner[] owners = new Owner[100];
        for (int i = 0; i < owners.length; i++) {
            owners[i] = OwnerFactory.next();
            for (int j = 0; j < 200; j++) {
                owners[i].addPet(PetFactory.next());
            }
            System.out.println(owners[i]);
        }
        System.out.println("общее " + Animal.getTotalAnimals());



    }

}

