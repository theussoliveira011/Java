package matheus.tbm.javalearning.javacore.Hheritage.test;

import matheus.tbm.javalearning.javacore.Hheritage.domains.Endereco;
import matheus.tbm.javalearning.javacore.Hheritage.domains.Funcionario;
import matheus.tbm.javalearning.javacore.Hheritage.domains.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("26526585-55");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Matheus Oliveira");
        pessoa.setCpf("556595-565-565");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("******************");
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Matheus Oliveira");
        funcionario.setCpf("555-5455-55-55");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(200000);
        funcionario.imprime();
    }
}
