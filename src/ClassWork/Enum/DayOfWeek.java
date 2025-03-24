package ClassWork.Enum;

public enum DayOfWeek {
    MONDAY("понедельник",1),
    TUESDAY("вторник",2)
    ,WEDNESDAY("среда",3),
    THURSDAY("четверг",4),
    FRIDAY("пятница",5)
    ,SATURDAY("суббота",6),
    SUNDAY("воскресенье",7);
    private final String russionName;
    private final int numDay;

    public String getRussionName() {
        return russionName;
    }

    public int getNumDay() {
        return numDay;
    }

    DayOfWeek(String russionName, int numDay) {
        this.russionName = russionName;
        this.numDay=numDay;
    }
}

