package matheus.tbm.maratonaJava.javacore.Imodificadorfinal.domains;

public class Anime {

    private String name;
    public static final double CAPACIDADE_DE_ANIMES; // constante.
    private final Comprador COMPRADOR = new Comprador();


    static{
        CAPACIDADE_DE_ANIMES = 250;
    }
    public Anime(String name){
        this.name = name;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public final void imprime(){
        System.out.println(this.name);
    }

    public Comprador getCOMPRADOR() {
        return COMPRADOR;
    }

    // methods
    @Override
    public String toString(){
        return "Anime: " + this.name;
    }
}
