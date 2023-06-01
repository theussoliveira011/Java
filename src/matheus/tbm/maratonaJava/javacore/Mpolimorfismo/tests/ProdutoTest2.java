package matheus.tbm.maratonaJava.javacore.Mpolimorfismo.tests;

import matheus.tbm.maratonaJava.javacore.Mpolimorfismo.domains.Computador;
import matheus.tbm.maratonaJava.javacore.Mpolimorfismo.domains.Product;
import matheus.tbm.maratonaJava.javacore.Mpolimorfismo.domains.Tomate;
import matheus.tbm.maratonaJava.javacore.Mpolimorfismo.service.CalculadoraImposto;

public class ProdutoTest2 {

    public static void main(String[] args) {
        Product produto = new Computador("Dell M300", 20000);

        Tomate produto2 = new Tomate("Tomate Abacaxi", 20000);
        produto2.setDataValidade("23/03/2023");

        CalculadoraImposto.calcularImpostoProduto(produto);
        System.out.println("----------------------------\n");
        CalculadoraImposto.calcularImpostoProduto(produto2);

    }
}