package matheus.tbm.maratonaJava.javacore.Qdate.tests;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest {
    public static void main(String[] args) {
        final Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        System.out.println("------------------");

        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println("-------------------");

        ZonedDateTime zonedDateTime = now.atZone(tokyoZone);
        System.out.println(zonedDateTime);
        System.out.println("-------------------");

        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println("-------------------");

        ZonedDateTime instantZoned = instant.atZone(tokyoZone);
        System.out.println(instantZoned);
        System.out.println("-------------------");

        System.out.println(ZoneOffset.MAX);
        System.out.println(ZoneOffset.MIN);
        System.out.println("-------------------");

        ZoneOffset manaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = now.atOffset(manaus);
        System.out.println(offsetDateTime);
        System.out.println("-------------------");

        OffsetDateTime of = OffsetDateTime.of(now, manaus);
        System.out.println(of);
        System.out.println("-------------------");

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
    }
}
