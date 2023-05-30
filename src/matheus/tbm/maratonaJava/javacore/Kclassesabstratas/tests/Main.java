package matheus.tbm.maratonaJava.javacore.Kclassesabstratas.tests;

import matheus.tbm.maratonaJava.javacore.Kclassesabstratas.domains.Desenvolvedor;
import matheus.tbm.maratonaJava.javacore.Kclassesabstratas.domains.Funcionario;
import matheus.tbm.maratonaJava.javacore.Kclassesabstratas.domains.Gerente;

public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Zoe", 5000.00);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Samba", 9000.00);
        gerente.imprime();
        desenvolvedor.imprime();



    }
}
