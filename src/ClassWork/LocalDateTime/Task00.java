package ClassWork.LocalDateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class Task00 {
    public static void main(String[] args) {
        String a = "abc";
        for (int i = 0; i < 1000; i++) {
            a += "1";
        }
        System.out.println(a);

        StringBuilder sb = new StringBuilder("abc");
        for (int i = 0; i < 1000; i++) {
            sb.append("1");
        }
        System.out.println(sb);

        LocalDate now = LocalDate.now();
        int year = now.getYear();
        System.out.println(year);
        Month month = now.getMonth();
        int i = month.get(ChronoField.MONTH_OF_YEAR);
        System.out.println(i);
        int dayOfMonth = now.getDayOfMonth();
        System.out.println(dayOfMonth);

        LocalDate localDate = LocalDate.of(2024, 11, 2);
        String displayName = localDate.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        System.out.println(displayName);

        LocalTime lt = LocalTime.of(13, 14, 44);

        LocalTime parse = LocalTime.parse("13:34:12");
        System.out.println(parse);
        LocalDate date = LocalDate.parse("2025-02-22");
        System.out.println(date);

        LocalDateTime ltd = LocalDateTime.of(2017, Month.NOVEMBER, 21, 13, 34, 56);
//        LocalDateTime vst = LocalDateTime.now(ZoneId.of("VST"));


        Duration between = Duration.between(LocalTime.of(15, 15, 15), LocalTime.of(16, 16, 16));
        //период между двумя
        System.out.println(between);
        long minutes = between.toMinutes();
        System.out.println(minutes);

        LocalDate date1 = date.withYear(2000);
        System.out.println(date1);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parse1 = LocalDate.parse("10/01/2009", dateTimeFormatter);
        System.out.println(parse1);

    }
}
