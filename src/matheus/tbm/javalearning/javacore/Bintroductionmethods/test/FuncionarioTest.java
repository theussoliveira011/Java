package matheus.tbm.javalearning.javacore.Bintroductionmethods.test;

import matheus.tbm.javalearning.javacore.Bintroductionmethods.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.name = "Richarde";
        funcionario.age = 35;
        funcionario.salary = new double[]{1200, 956, 7000};

        funcionario.imprimir();

        double result = funcionario.getSalary(funcionario.salary);

        System.out.println(result);
    }
}
