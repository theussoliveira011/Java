package matheus.tbm.maratonaJava.javacore.Rformatacao.tests;

import java.util.Locale;

public class LocaleTest02 {

    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] stringCounters = Locale.getISOCountries();
        String[] stringLanguages = Locale.getISOLanguages();
        for (String isoCountry: stringCounters
             ) {
            System.out.print(isoCountry+" ");
        }

        System.out.println("========================");

        for (String isoLanguages: stringLanguages
             ) {
            System.out.print(isoLanguages+" ");
        }

    }
}
