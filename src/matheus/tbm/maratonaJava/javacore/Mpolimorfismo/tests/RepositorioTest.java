package matheus.tbm.maratonaJava.javacore.Mpolimorfismo.tests;

import matheus.tbm.maratonaJava.javacore.Mpolimorfismo.repositorio.Repositorio;
import matheus.tbm.maratonaJava.javacore.Mpolimorfismo.service.RepositorioArquivo;
import matheus.tbm.maratonaJava.javacore.Mpolimorfismo.service.RepositorioBancoDeDados;
import matheus.tbm.maratonaJava.javacore.Mpolimorfismo.service.RepositorioMemoria;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTest {

    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        Repositorio repositorio1 = new RepositorioArquivo();
        Repositorio repositorio2 = new RepositorioMemoria();
        repositorio.salvar();
        repositorio1.salvar();
        repositorio2.salvar();
        List<String> lista = new LinkedList<>();
        lista.add("Hello");
        lista.add("World");
        lista.add("!");
        System.out.println(lista);

    }

}
