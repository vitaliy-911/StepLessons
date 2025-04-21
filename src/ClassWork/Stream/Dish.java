package ClassWork.Stream;

import java.util.Objects;

public class Dish {

    private final String name;
    private final boolean vegan;
    private final  int callories;
    private final Type tipe;

    public Dish(String name,boolean vegan, int callories, Type tipe) {
        this.name=name;
        this.vegan = vegan;
        this.callories = callories;
        this.tipe = tipe;
    }


    public String getName() {
        return name;
    }

    public boolean isVegan() {
        return vegan;
    }

    public int getCallories() {
        return callories;
    }

    public Type getTipe() {
        return tipe;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dish dish = (Dish) o;
        return callories == dish.callories && Objects.equals(name, dish.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, callories);
    }
}
