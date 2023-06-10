package matheus.tbm.maratonaJava.javacore.Slambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaStreamsTest {
    public static void main(String[] args) {
        // API de Stream

        // Stream -> Fluxo de dados

        List<Integer> asList = Arrays.asList(1,2,3,4);
        System.out.println(asList);

        Stream<Integer> secondList = asList.stream().filter(e -> e % 2 == 0);

    }
}