package matheus.tbm.maratonaJava.javacore.Hheritage.test;

import matheus.tbm.maratonaJava.javacore.Hheritage.domains.Endereco;
import matheus.tbm.maratonaJava.javacore.Hheritage.domains.Funcionario;
import matheus.tbm.maratonaJava.javacore.Hheritage.domains.Pessoa;

public class PessoaTest{
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("26526585-55");
        Pessoa pessoa = new Pessoa("Matheus Oliveira");
        pessoa.setCpf("556595-565-565");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Pessoa funcionario3 = new Pessoa("Marcela");

        System.out.println("******************");
        Funcionario funcionario = new Funcionario("Matheus Oliveira", "555-555-555-66");
        Funcionario funcionario2 = new Funcionario("Matheus Oliveira", "555-555-555-66");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(200000);
        funcionario.imprime();
        System.out.println(pessoa.equals(funcionario));
        System.out.println(funcionario.equals(pessoa));
        System.out.println("------------=============");

        System.out.println("888888888888888888888888888");
        System.out.println(pessoa);
        System.out.println(funcionario);
        System.out.println(funcionario2);
        System.out.println(funcionario3);
    }
}
