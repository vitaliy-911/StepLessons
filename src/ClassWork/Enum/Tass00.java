package ClassWork.Enum;

import java.util.EnumMap;
import java.util.EnumSet;

public class Tass00 {
    public static void main(String[] args) {
        DayOfWeek friday = DayOfWeek.FRIDAY;
        String russionName= friday.getRussionName();
        System.out.println(russionName);
       for (DayOfWeek values:DayOfWeek.values()){
           System.out.println(values.getRussionName());
       }
       DayOfWeek monday=DayOfWeek.valueOf("MONDAY");
        System.out.println(monday.getRussionName());
        EnumSet<DayOfWeek>dayOfWeeks=EnumSet.of(DayOfWeek.MONDAY,DayOfWeek.WEDNESDAY);
        EnumMap<DayOfWeek,Integer>dayOfWeekIntegerEnumMap=new EnumMap<>(DayOfWeek.class);
//        test(friday);
    }

    private static void test(DayOfWeek dayOfWeek) {
        if (DayOfWeek.FRIDAY == dayOfWeek) {
            System.out.println("Ура пятница");
        }
    }
}
