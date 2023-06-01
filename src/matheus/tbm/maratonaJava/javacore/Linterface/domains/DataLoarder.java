package matheus.tbm.maratonaJava.javacore.Linterface.domains;

public interface DataLoarder {

    void load();
    default void checkPermission(){
        System.out.println("Checando permissões");
    }

}
