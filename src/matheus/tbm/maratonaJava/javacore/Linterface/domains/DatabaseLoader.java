package matheus.tbm.maratonaJava.javacore.Linterface.domains;

public class DatabaseLoader implements DataLoarder, DataRemover {

    @Override
    public void load() {
        System.out.println("loading data from database");
    }

    @Override
    public void remove() {
        System.out.println("removing data from database");
    }
}
