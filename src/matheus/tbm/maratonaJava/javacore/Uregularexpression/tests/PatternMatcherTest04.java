package matheus.tbm.maratonaJava.javacore.Uregularexpression.tests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {

        String regexExpression = "([a-zA-Z\\d\\._-])+@([a-z])+(\\.([a-z])+)+";
        String text = "matheusdesenvolvedor011@gmail.com" +
                ", matheus@gmail.com, " +
                "matheus@mail.com.br, " +
                "matheus@hotmail.com, " +
                "sakura@yahoo.com.br" +
                "sasuke@GMAIL.com.br";
        Pattern pattern = Pattern.compile(regexExpression);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            System.out.println(matcher.start()+ " "+matcher.group());
        }
    }

}
