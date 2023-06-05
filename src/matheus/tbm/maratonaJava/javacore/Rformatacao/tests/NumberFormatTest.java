package matheus.tbm.maratonaJava.javacore.Rformatacao.tests;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
    public static void main(String[] args) {
        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        Locale localeCH = Locale.CHINA;

        NumberFormat[] array = new NumberFormat[4];

        array[0] = NumberFormat.getInstance(localePT);
        array[1] = NumberFormat.getInstance(localeIT);
        array[2] = NumberFormat.getInstance(localeJP);
        array[3] = NumberFormat.getInstance(localeCH);

        double value = 10_000.2130D;

        for (NumberFormat numberFormat : array) {
            System.out.println(numberFormat.format(value));
        }

    }
}
