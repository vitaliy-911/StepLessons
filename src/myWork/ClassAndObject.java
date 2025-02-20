package myWork;

public class ClassAndObject {
    public static void main(String[] args) {
        Transport bmw = new Transport();
        bmw.setValues(250.5F,2500,"White",new byte[]{0,0,0});
        String res1= bmw.getValues();
        System.out.println(res1);
//        bmw.speed = 250.5F;
//        bmw.weight = 2500;
//        bmw.color = "white";
//        bmw.coordinate = new byte[]{0, 0, 0};

        Transport truck = new Transport();
        truck.speed = 140.5F;
        truck.weight = 5600;
        truck.color = "blak";
        truck.coordinate=new byte[]{100,0,100};

        System.out.println(truck.speed+" "+bmw.speed);
    }
}
