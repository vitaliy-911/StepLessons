package HomeWork.HomeWorkVoenkom;

public class ArrayRecruits {

    private Recruit[] recruits;
    private int size;

    public ArrayRecruits(int capacity) {
        recruits = new Recruit[capacity];
        size = 0;
    }

    public void add(Recruit recruit) {
        if (size < recruits.length) {
            recruits[size++] = recruit;
        } else {
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
}



