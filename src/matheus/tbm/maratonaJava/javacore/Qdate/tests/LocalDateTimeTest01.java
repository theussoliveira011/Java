package matheus.tbm.maratonaJava.javacore.Qdate.tests;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.of(2022, Month.AUGUST, 6);
        String time = LocalTime.now().toString();
        LocalTime timeParsed = LocalTime.parse(time);
        System.out.println(timeParsed);
        System.out.println(date);
        LocalDateTime dateTime = date.atTime(timeParsed);
        System.out.println("----");
        System.out.println(dateTime);


    }

}
