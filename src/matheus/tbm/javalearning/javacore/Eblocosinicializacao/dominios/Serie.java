package matheus.tbm.javalearning.javacore.Eblocosinicializacao.dominios;

public class Serie {
    private String name;
    private int[] episodios = {1,2,3,4,5,6,7,8,9,10,11,12};

    {
        System.out.println("Dentro do bloco de inicializacao");
    }
    public Serie(String name){
        this.name = name;
    }
    public Serie(){
        for(int episodio : episodios){
            System.out.println(episodio);
        }
    }
}
