package HomeWork.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Car {
    private int year;
    private String model;

    public Car(int year, String model) {
        year = year;
        this.model = model;
    }
    public static void test(){
        Car audi=new Car(1988,"Audi");
        Car bmv=new Car(2005,"BMV");
        List<Car>cars=new ArrayList<>();
        cars.add(audi);
        cars.add(bmv);

        for (Car car:cars){
            if(car.year==2005){
                System.out.println(car);
            }
        }
        Iterator<Car>iterator=cars.iterator();
        while (iterator.hasNext()){
            Car next=iterator.next();
            if (next.year==2005){
                iterator.remove();
                break;
            }
        }
        System.out.println(cars);

    }
}
