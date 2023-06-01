package matheus.tbm.maratonaJava.javacore.Mpolimorfismo.service;

import matheus.tbm.maratonaJava.javacore.Mpolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }
}
