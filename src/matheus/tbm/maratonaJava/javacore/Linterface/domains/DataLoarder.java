package matheus.tbm.maratonaJava.javacore.Linterface.domains;

public interface DataLoarder {
    // private -> default -> protected -> public; Order of protection modificators

    void load();
    default void checkPermission(){
        System.out.println("Checando permissões");
    }

}
