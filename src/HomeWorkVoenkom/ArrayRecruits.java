package HomeWorkVoenkom;

import ClassWork.L30_01_25.Wheel;

public class ArrayRecruits {

    private Recruit[] recruits;
    int size;

    public ArrayRecruits(int capacity) {
        recruits = new Recruit[capacity];
        size = 0;
    }

    public void add(Recruit recruit) {
        if (size < recruits.length) {
            recruits[size++] = recruit;
        }else {
            Recruit[] recruits1 = new Recruit[recruits.length + 1];
            for (int i = 0; i < recruits.length; i++) {
                recruits1[i] = recruits[i];
            }
            recruits1[size++] = recruit;
            recruits = recruits1;
        }
    }

    public Recruit[] getRecruits() {
        return recruits;
    }

    public Recruit get(int index) {
        if (index >= 0 && index < size) {
            return recruits[index];
        }
        return null;
    }

    public int getSize() {
        return size;
    }

//    public void sortByLastName() {
//        for (int i = 0; i < size - 1; i++) {
//            for (int j = i + 1; j < size; j++) {
//                if (recruits[j] == null || recruits[j + 1] == null) {
//                    continue;
//                }
//                if (recruits[j].getLastName().compareTo(recruits[j+1].getLastName()) > 0) {
//                    Recruit temp = recruits[j];
//                    recruits[j] = recruits[j+1];
//                    recruits[j] = temp;
//                }
//            }
//        }
//    }
}



