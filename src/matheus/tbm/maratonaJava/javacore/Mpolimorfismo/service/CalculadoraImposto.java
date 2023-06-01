package matheus.tbm.maratonaJava.javacore.Mpolimorfismo.service;

import matheus.tbm.maratonaJava.javacore.Mpolimorfismo.domains.Product;
import matheus.tbm.maratonaJava.javacore.Mpolimorfismo.domains.Tomate;

public class CalculadoraImposto {

    public static void calcularImpostoProduto(Product produto){
        System.out.println("Relatório de imposto do "+produto.getName());
        double imposto = produto.calcularImposto();
        System.out.println("Imposto do produto: " + produto.getName());
        System.out.println("valor: "+produto.getPrice());
        System.out.println("Imposto a ser pago "+imposto);

        if(produto instanceof Tomate){
//            Tomate tomate = (Tomate) produto;
//            System.out.println(tomate.getDataValidade());
            String dataValidade = ((Tomate) produto).getDataValidade();
            System.out.println(dataValidade);
        }
    }
}
