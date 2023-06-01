package matheus.tbm.maratonaJava.javacore.Linterface.domains;

public class FileLoader implements DataLoarder, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando um dado do sistema de arquivos");
    }

    @Override
    public void remove() {
        System.out.println("deleting data from a file");
    }
}
