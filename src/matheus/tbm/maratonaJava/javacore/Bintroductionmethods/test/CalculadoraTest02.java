package matheus.tbm.maratonaJava.javacore.Bintroductionmethods.test;

import matheus.tbm.maratonaJava.javacore.Bintroductionmethods.domain.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;

        Calculadora calculadora = new Calculadora();
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println(num1);
        System.out.println(num2);
    }
}
