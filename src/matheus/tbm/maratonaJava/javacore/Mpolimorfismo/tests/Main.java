package matheus.tbm.maratonaJava.javacore.Mpolimorfismo.tests;


import matheus.tbm.maratonaJava.javacore.Mpolimorfismo.domains.Computador;
import matheus.tbm.maratonaJava.javacore.Mpolimorfismo.domains.Notebook;
import matheus.tbm.maratonaJava.javacore.Mpolimorfismo.domains.Tomate;
import matheus.tbm.maratonaJava.javacore.Mpolimorfismo.service.CalculadoraImposto;

public class Main {
    public static void main(String[] args) {

        Computador computador = new Computador("Dell 50\" ", 4000.23);
        Tomate tomate = new Tomate("Tomate Americano", 5420.25);
        Notebook notebook = new Notebook("Dell M450", 6000);
        CalculadoraImposto.calcularImpostoProduto(tomate);
        System.out.println("============================");
        CalculadoraImposto.calcularImpostoProduto(computador);
        System.out.println("============================");
        CalculadoraImposto.calcularImpostoProduto(notebook);

    }
}
