package matheus.tbm.maratonaJava.javacore.Mpolimorfismo.tests;

import matheus.tbm.maratonaJava.javacore.Mpolimorfismo.domains.Computador;
import matheus.tbm.maratonaJava.javacore.Mpolimorfismo.domains.Product;
import matheus.tbm.maratonaJava.javacore.Mpolimorfismo.domains.Tomate;

import java.sql.SQLOutput;

public class ProdutoTest {

    public static void main(String[] args) {
        Product produto = new Computador("Dell M300", 20000);
        System.out.println(produto.getName());
        System.out.println(produto.getPrice());
        System.out.println(produto.calcularImposto());
        System.out.println("==========================");
        System.out.println("==========================");
        Product produto2 = new Tomate("Tomate Abacaxi", 20000);
        System.out.println(produto2.getName());
        System.out.println(produto2.getPrice());
        System.out.println(produto2.calcularImposto());

    }
}