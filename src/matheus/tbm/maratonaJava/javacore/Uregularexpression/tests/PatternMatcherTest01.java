package matheus.tbm.maratonaJava.javacore.Uregularexpression.tests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        // matheusdesenvolvedor011@gmail.com
        String regexExpression = "je";
        String text = "JefferJeferiwjekfooiwejfejefje";
        String text2 = "JefferJeferiwjekfooiwejfejefje";
        Pattern pattern = Pattern.compile(regexExpression);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            System.out.println(matcher.start()+ " ");
        }
    }
}
