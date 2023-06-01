package matheus.tbm.maratonaJava.javacore.Mpolimorfismo.domains;

public class Notebook extends Product{
    public static final double IMPOSTO_POR_CENTO = 0.21;

    public Notebook(String name, double price) {
        super(name, price);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do computador...");
        return this.price * IMPOSTO_POR_CENTO;
    }
}
