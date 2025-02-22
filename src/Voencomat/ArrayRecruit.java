package Voencomat;

public class ArrayRecruit {

    Recruit[] recruits;
    int size;

    public void add(Recruit recruit) {
        if (size < recruits.length) {
            recruits[size] = recruit;
            size++;

        } else {
            Recruit[] recruits1 = new Recruit[recruits.length + 1];
            for (int i = 0; i <recruits.length ; i++) {
                recruits1[i]=recruits[i];
            }
            recruits1[size++]=recruit;
            recruits=recruits1;
        }
    }
    public Recruit[] getRecruits() {
        return recruits;
    }

}

