package matheus.tbm.maratonaJava.javacore.Qdate.tests;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeTest01 {

    public static void main(String... args){
        LocalTime time = LocalTime.now(ZoneId.of("BET", ZoneId.SHORT_IDS));
        System.out.println(time);
    }
}
