package matheus.tbm.maratonaJava.javacore.Hheritage.domains;

import java.util.Objects;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco de inicialização estático de pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização de pessoa 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização de pessoa 2 ");
    }

    public Pessoa(String nome){
        System.out.println("Dentro do construtor");
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua()+ " "+ this.endereco.getCep());
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object obj){

        if(obj instanceof Pessoa){
            Pessoa p = (Pessoa) obj;
            return this.nome.equals(p.getNome());
        }

        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + this.nome + '\'' +
                ", cpf='" + this.cpf + '\'' +
                ", endereco=" + this.getEndereco() +
                '}';
    }
}
