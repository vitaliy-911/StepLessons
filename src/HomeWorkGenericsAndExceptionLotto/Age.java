package HomeWorkGenericsAndExceptionLotto;

public enum Age {
    YOUNG,
    AVERAGE,
    OLD;

    public Participant participant() throws NotInitializedException{
        if (participant().getAge()<18){
            throw new NotInitializedException("Меньше 18 лет");
        }
        int year = participant().getAge();
        if (year > 18 && year < 30) {
            YOUNG.participant();
        }
        if (year > 30 && year < 50) {
             AVERAGE.participant();
        }
        if (year > 50) {
             OLD.participant();
        }
        return participant();
    }
}
