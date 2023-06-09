package matheus.tbm.maratonaJava.javacore.Qdate.tests;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String... args) {
        // Duration trabalha com o tempo.
        // Nano-Segundos, Mili-segundos, segundos, minutos, horas.

        LocalDateTime nowDate = LocalDateTime.now();
        LocalDateTime nowTwoYears = LocalDateTime.now().plusYears(2);
        LocalTime nowTime = LocalTime.now();
        LocalTime beforeTime = LocalTime.now().minusHours(7);

        Duration duration = Duration.between(nowDate, nowTwoYears);
        Duration duration1 = Duration.between(nowTime, beforeTime);
        Duration duration2 = Duration.between(Instant.now(), Instant.now().plusSeconds(100000000000L));
        Duration duration3 = Duration.ofDays(365L);


        System.out.println(duration);
        System.out.println("=======");
        System.out.println(duration1);
        System.out.println("=======");
        System.out.println(duration2);
        System.out.println("=======");
        System.out.println(duration3);
    }
}