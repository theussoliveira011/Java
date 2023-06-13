package matheus.tbm.maratonaJava.javacore.Uregularexpression.tests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // []
        // ? zero ou uma.
        // * zero ou mais.
        // + uma ou mais ocorrências.
        // {n, m} de n até m.
        // () agrupamento.
        // | "ou" o(v|c)o ovo | oco.
        // $ representa o fim da linha.
        // . 1.3 -> 123, 133, 1@3, 1A3, A53 -> "coringa"

        String regexExpression = "0[xX]([\\da-fA-F])+(\\s|$)";
        String text = "12 0x 0x 23 91 0xF1ACB 0x222 0x10G 0x1";
        Pattern pattern = Pattern.compile(regexExpression);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            System.out.println(matcher.start()+ " "+matcher.group());
        }
    }

}
