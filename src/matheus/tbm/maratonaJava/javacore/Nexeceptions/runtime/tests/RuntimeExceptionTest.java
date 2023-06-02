package matheus.tbm.maratonaJava.javacore.Nexeceptions.runtime.tests;

public class RuntimeExceptionTest {
    // CHECKED e UNCHECKED
    // Checked -> São filhas da Classe Exception diretamente, se não são tratadas, lançam um Erro em tempo de compilação.
    // Unchecked -> São filhas da SubClasse RuntimeException, indica que o desenvolvedor fez algo errado.
    // RuntimeException -> uma exceção que ocorre na compilação do código!.

    public static void main(String[] args) {
        Object object = null;
        System.out.println(object.toString()); // NullPointerException -> tentando acessar um objeto que é nulo.

        int[] num = {1,2};
        System.out.println(num[2]); // ArrayIndexOutOfBoundsException -> tentando acessar um índice inexistente em um array.
    }
}
