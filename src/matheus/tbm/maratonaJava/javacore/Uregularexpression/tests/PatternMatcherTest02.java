package matheus.tbm.maratonaJava.javacore.Uregularexpression.tests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // meta caracteres
        // \d -> retorna todos os digitos
        // \D -> retorna todos os caracteres menos os digitos
        // \s -> retorna espaços em branco \t \n \f \r
        // \S -> retorna os caracteres menos os brancos
        // \w = a-ZA-Z, dígitos, _
        // \W = retorna tudo que não for incluso no \w

        // matheusdesenvolvedor011@gmail.com
        String regexExpression = "\\d";
        String text = "jh2j1hj3h4";
        Pattern pattern = Pattern.compile(regexExpression);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            System.out.println(matcher.start()+ " "+matcher.group());
        }

        System.out.println("====================");

        regexExpression = "\\D";
        text = "jh2j1hj3h4";
        pattern = Pattern.compile(regexExpression);
        matcher = pattern.matcher(text);

        while(matcher.find()){
            System.out.println(matcher.start()+ " "+matcher.group());
        }

        System.out.println("====================");

        regexExpression = "\\s";
        text = "jh2j1 hj3h\t4\f";
        pattern = Pattern.compile(regexExpression);
        matcher = pattern.matcher(text);

        while(matcher.find()){
            System.out.println(matcher.start()+ " "+matcher.group());
        }

        System.out.println("====================");

        regexExpression = "\\S";
        text = "jh2j@1 h j3\th 4";
        pattern = Pattern.compile(regexExpression);
        matcher = pattern.matcher(text);

        while(matcher.find()){
            System.out.println(matcher.start()+ " "+matcher.group());
        }

        System.out.println("====================");

        regexExpression = "\\w";
        text = "jh2j1_hj3h@4_";
        pattern = Pattern.compile(regexExpression);
        matcher = pattern.matcher(text);

        while(matcher.find()){
            System.out.println(matcher.start()+ " "+matcher.group());
        }

        System.out.println("====================");

        regexExpression = "\\W";
        text = "jh2j1hj!#3h@_";
        pattern = Pattern.compile(regexExpression);
        matcher = pattern.matcher(text);

        while(matcher.find()){
            System.out.println(matcher.start()+ " "+matcher.group());
        }

    }

}
