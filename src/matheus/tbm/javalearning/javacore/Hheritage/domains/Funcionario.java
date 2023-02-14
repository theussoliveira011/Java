package matheus.tbm.javalearning.javacore.Hheritage.domains;

public class Funcionario extends Pessoa {
    private double salario;


    public void imprime() {
        // this.nome, this.cpf e this.endereco;
        super.imprime(); // -> usado para acessar o método imprime() da classe Pessoa
        System.out.println(this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
