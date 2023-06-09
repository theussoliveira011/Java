package matheus.tbm.maratonaJava.javacore.Qdate.tests;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest01 {
    public static void main(String[] args) {
        //A classe LocalDate é imutável, para alterar a varíavel de referência é necessário declara-lá novamente.

        LocalDate date = LocalDate.of(2023, Month.JANUARY, 27);
        System.out.println(date.getYear());
        System.out.println(date.getMonthValue());
        System.out.println(date.getMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.isLeapYear());
        System.out.println("========================");
        System.out.println(date);
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
    }
}
