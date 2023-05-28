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

        System.out.println("******************");
        Funcionario funcionario = new Funcionario("Matheus Oliveira", "555-555-555-66");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(200000);
        funcionario.imprime();
    }
}
