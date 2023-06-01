package matheus.tbm.maratonaJava.javacore.Mpolimorfismo.domains;

public class Tomate extends Product {

    public static final double IMPOSTO_POR_CENTO = .021;
    private String dataValidade;


    public Tomate(String name, double price) {
        super(name, price);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do tomate...");
        return this.price * IMPOSTO_POR_CENTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
