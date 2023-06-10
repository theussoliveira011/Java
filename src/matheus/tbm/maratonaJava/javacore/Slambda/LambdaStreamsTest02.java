package matheus.tbm.maratonaJava.javacore.Slambda;

import java.util.Arrays;
import java.util.List;

public class LambdaStreamsTest02 {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(3, 4, 6, 8, 9, 8, 5, 2, 7, 8, 9, 15);
        List<Integer> arraySorted = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        // JAVA 8: STREAMS
        // Stream: Fluxo de dados

        // operação intermediária -> é possível fazer várias operações antes de 'fechar' o stream
        // ex: skip, limit, distinct -> semelhante à função distinct do sql, usa equals e hashcode para fazer a verificação.
        // map -> a lista original continua a mesma.
        arraySorted.stream()
                .limit(6)
                .map(e -> e * 2)
                .forEach(e -> System.out.print(e + " "));

        // JAVA 5
//        for (Integer i: array) {
//            System.out.println(i);
//        }

    }
}