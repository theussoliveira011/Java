package matheus.tbm.maratonaJava.javacore.Nexeceptions.error.tests;

public class StackOverFlow01 {

    public static void main(String[] args) {
        // Error é uma subclasse de Throwable.
        // Uma Exceção é uma Classe.
        recursividade();
    }

    public static void recursividade(){
        recursividade();
    }
}
