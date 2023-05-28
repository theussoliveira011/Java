package matheus.tbm.maratonaJava.javacore.Fmodificatorstatic.domain;

public class Serie {
    private String name;
    private static int[] episodios;

    static {
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[100];
        for(int episodio = 0; episodio < episodios.length; episodio++){
            System.out.print(episodio + " ");
        }
    }
    public Serie(String name){
        this.name = name;
    }
    public Serie(){
    }
}
