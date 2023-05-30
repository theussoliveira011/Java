package matheus.tbm.maratonaJava.javacore.Kclassesabstratas.domains;

public class Gerente  extends Funcionario {
    public Gerente(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void calculaBonus() {
        this.salary = this.salary + (this.salary * 0.3);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
