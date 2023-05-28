package matheus.tbm.maratonaJava.javacore.Bintroductionmethods.test;

import matheus.tbm.maratonaJava.javacore.Bintroductionmethods.domain.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setName("Richarde");
        funcionario.setAge(35);
        funcionario.setSalary(new double[]{1200, 3000, 4000});

        System.out.println(funcionario.getSalary());
        funcionario.imprimeMedia();
    }
}
