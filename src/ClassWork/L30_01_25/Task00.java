package ClassWork.L30_01_25;

public class Task00 {
    public static void main(String[] args) {

        Wheel[] wheels = new Wheel[4];

        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel("Winter", 18, "rezina");
        }
        Car audi = new Car("audi", "tt", 2018, wheels);
        //System.out.println(audi);
        WheelArray wheelArray = new WheelArray(6);
        wheelArray.add(new Wheel("Winter", 18, "rezina"));
        wheelArray.add(new Wheel("Winter", 18, "rezina"));
        wheelArray.add(new Wheel("Winter", 18, "rezina"));
        wheelArray.add(new Wheel("Winter", 18, "rezina"));
        wheelArray.add(new Wheel("Winter", 18, "rezina"));
        wheelArray.add(new Wheel("Summer", 16, "rezina"));
       // System.out.println(wheelArray);
       // Wheel wheel = wheelArray.get(wheelArray.size - 1);
        //System.out.println(wheel);
//        wheelArray.sortByDiametr();
//        System.out.println(wheelArray);
//        wheelArray.sortByTape();
//        System.out.println(wheelArray);
        wheelArray.toString();



    }

}
