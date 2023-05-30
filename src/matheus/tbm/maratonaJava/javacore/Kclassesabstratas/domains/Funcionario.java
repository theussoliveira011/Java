package matheus.tbm.maratonaJava.javacore.Kclassesabstratas.domains;

import java.util.Objects;

public abstract class Funcionario extends Pessoa {
    protected String name;
    protected double salary;

    @Override
    public void imprime() {
        System.out.println("Gerente{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}');
    }

    public Funcionario(String name, double salary) {
        this.name = name;
        this.salary = salary;
        calculaBonus();
    }

    public abstract void calculaBonus();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Double.compare(that.salary, salary) == 0 && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }
}
