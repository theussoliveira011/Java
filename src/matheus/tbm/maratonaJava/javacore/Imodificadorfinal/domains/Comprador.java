package matheus.tbm.maratonaJava.javacore.Imodificadorfinal.domains;

public class Comprador {

    private String name;

    public Comprador(){

    }

    public Comprador(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Comprador{" +
                "name='" + name + '\'' +
                '}';
    }
}
