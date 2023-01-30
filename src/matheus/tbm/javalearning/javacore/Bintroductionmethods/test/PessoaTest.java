package matheus.tbm.javalearning.javacore.Bintroductionmethods.test;

import matheus.tbm.javalearning.javacore.Bintroductionmethods.domain.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setName("Samba");
        pessoa.setAge(28);
        pessoa.setPassword("querosene");

        System.out.println(pessoa.getName());
        System.out.println(pessoa.getAge());
        System.out.println(pessoa.getPassword());
    }
}