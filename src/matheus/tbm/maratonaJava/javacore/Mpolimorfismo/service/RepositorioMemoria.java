package matheus.tbm.maratonaJava.javacore.Mpolimorfismo.service;

import matheus.tbm.maratonaJava.javacore.Mpolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando na memória");
    }
}
