package matheus.tbm.maratonaJava.javacore.Qdate.tests;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate dateAfter = LocalDate.of(2039, 11, 25);

        Period period = Period.between(nowDate, dateAfter);
        Period period1 = Period.ofDays(2000);
        Period period2 = Period.ofWeeks(400);
        Period period3 = Period.ofMonths(3);

        System.out.println(period); // 16 Y -> Years | 5 M -> Months | 17 D -> Days;
        System.out.println("======");
        System.out.println(period1);
        System.out.println("======");
        System.out.println(period2);
        System.out.println("======");
        System.out.println(period3);
    }
}
