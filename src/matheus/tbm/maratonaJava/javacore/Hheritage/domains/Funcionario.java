package matheus.tbm.maratonaJava.javacore.Hheritage.domains;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome){
        super(nome);
    }

    public Funcionario(String nome, String cpf){
        super(nome, cpf);
    }

    public void imprime() {
        // this.nome, this.cpf e this.endereco;
        super.imprime(); // -> usado para acessar o método imprime() da classe Pesso
    }

    public double getSalario() {
        return salario;
    }

    public void relatioPagamento(){
        System.out.println("Eu "+ this.nome+ " recebi o salario de: "+this.salario);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
