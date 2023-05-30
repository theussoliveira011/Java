package matheus.tbm.maratonaJava.javacore.Kclassesabstratas.domains;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void calculaBonus() {
        this.salary = this.salary + (this.salary * 0.5);
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
