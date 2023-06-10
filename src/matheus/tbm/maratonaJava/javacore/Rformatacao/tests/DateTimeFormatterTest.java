package matheus.tbm.maratonaJava.javacore.Rformatacao.tests;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        String string1 = now.format(DateTimeFormatter.BASIC_ISO_DATE);
        String string2 = now.format(DateTimeFormatter.ISO_DATE);
        String string3 = now.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(string1);
        System.out.println("------");
        System.out.println(string2);
        System.out.println("------");
        System.out.println(string3);
        System.out.println("------");

        LocalDate parse = LocalDate.parse("20230610", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse1 = LocalDate.parse("2023-06-10", DateTimeFormatter.ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2023-06-10", DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(parse);
        System.out.println("--------");
        System.out.println(parse1);
        System.out.println("--------");
        System.out.println(parse2);
        System.out.println("------------");

        LocalDateTime hi = LocalDateTime.now();

        String string4 = hi.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(string4);
        System.out.println("----------------");

        LocalDateTime parse3 = LocalDateTime.parse("2023-06-10T18:32:23.758");
        System.out.println(parse3);
        System.out.println("----------------");

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String formatBR = LocalDateTime.now().format(formatterBR);
        System.out.println(formatBR);
        System.out.println("-----------------");

    }
}
