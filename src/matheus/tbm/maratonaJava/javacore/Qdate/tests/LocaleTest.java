package matheus.tbm.maratonaJava.javacore.Qdate.tests;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        Locale l = new Locale("bra", "BR");
        Locale s = new Locale("it", "CH");
        Locale h = new Locale("hi", "IN");
        Locale jp = new Locale("ja", "JP");

        Calendar calendar = Calendar.getInstance();
        DateFormat italy = DateFormat.getDateInstance(DateFormat.FULL, l);
        DateFormat suece = DateFormat.getDateInstance(DateFormat.FULL, s);
        DateFormat india = DateFormat.getDateInstance(DateFormat.FULL, h);
        DateFormat japan = DateFormat.getDateInstance(DateFormat.FULL, jp);

        System.out.println(italy.format(calendar.getTime()));
        System.out.println(suece.format(calendar.getTime()));
        System.out.println(india.format(calendar.getTime()));
        System.out.println(japan.format(calendar.getTime()));
    }
}
