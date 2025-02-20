package ClassWork.L30_01_25;

import java.util.Arrays;

public class WheelArray {

    Wheel[] wheels;
    int size;

    public WheelArray(int capacity) {
        wheels = new Wheel[capacity];
    }

    public void add(Wheel wheel) {//добавить переменную
        if (size < wheels.length) {
            wheels[size++] = wheel;
        } else {
            Wheel[] wheels1 = new Wheel[wheels.length + 1];
            for (int i = 0; i < wheels.length; i++) {
                wheels1[i] = wheels[i];
            }
            wheels1[size++] = wheel;
            wheels = wheels1;
        }
    }

    public Wheel get(int index) {
        return wheels[index];
    }

    public void sortByDiametr() {
        for (int i = 0; i < wheels.length - 1; i++) {
            for (int j = 0; j < wheels.length - 1 - i; j++) {
                if (wheels[j].diametr > wheels[j + 1].diametr) {
                    Wheel temp = wheels[j];
                    wheels[j] = wheels[j + 1];
                    wheels[j + 1] = temp;
                }
            }
        }

    }

    public void sortByTape() {//сортирует по алфавиту
        for (int i = 0; i < wheels.length - 1; i++) {
            for (int j = 0; j < wheels.length - 1 - i; j++) {
                if (wheels[j].type.compareTo(wheels[j + 1].type) < 0) {
                    Wheel temp = wheels[j];
                    wheels[j] = wheels[j + 1];
                    wheels[j + 1] = temp;
                }
            }
        }

    }
    public int getSize(){
        return size;
    }



    @Override
    public String toString() {
        return "WheelArray{" +
                "wheels=" + Arrays.toString(wheels) +
                ", size=" + size +
                '}';
    }
}
