package matheus.tbm.maratonaJava.javacore.Bintroductionmethods.test;

import matheus.tbm.maratonaJava.javacore.Bintroductionmethods.domain.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros(15, 25);

        calculadora.divideDoisNumeros(45, 67.5);
        calculadora.multiplicaDoisNumeros(45, 67.5);

        double result = calculadora.subtraiDoisNumeros(45, 67.5);
        System.out.println(result);
    }
}
