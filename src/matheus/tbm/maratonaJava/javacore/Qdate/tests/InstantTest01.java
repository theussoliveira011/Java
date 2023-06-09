package matheus.tbm.maratonaJava.javacore.Qdate.tests;

import java.time.Instant;

public class InstantTest01 {
    public static void main(String[] args) {
        // Usa Zulu-time, um tipo de horário universal como o UTC.
        // Não consigo pensar numa forma útil de usar essa classe ainda.
        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println(instant.getNano()); // 1s -> 999.999.999ns

    }
}
