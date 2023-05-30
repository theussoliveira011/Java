package matheus.tbm.maratonaJava.javacore.Hheritage.domains;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estático de Funcionário");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Funcionário 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Funcionário 2 ");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de Funcionário");
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

    @Override
    public boolean equals(Object obj){

        if(obj instanceof Funcionario){
            Funcionario f = (Funcionario) obj;
            return this.nome.equals(f.getNome());
        }

        return false;
    }
}
