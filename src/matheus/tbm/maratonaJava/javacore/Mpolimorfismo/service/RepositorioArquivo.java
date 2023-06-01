package matheus.tbm.maratonaJava.javacore.Mpolimorfismo.service;

import matheus.tbm.maratonaJava.javacore.Mpolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
