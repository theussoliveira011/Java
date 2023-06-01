package matheus.tbm.maratonaJava.javacore.Mpolimorfismo.domains;

public class Computador extends Product{

    public static final double IMPOSTO_POR_CENTO = .034;



    public Computador(String name, double price) {
        super(name, price);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do computador...");
        return this.price * IMPOSTO_POR_CENTO;
    }
}
