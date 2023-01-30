package matheus.tbm.javalearning.practice.domains;

public class Aluno {

    public int Id;
    private String name;
    private static Seminario seminario;

    public Aluno(int id, String name) {
        this.Id = id;
        this.name = name;
    }

    public Aluno(int Id, String name, Seminario seminario){
        this.Id = Id;
        this.name = name;
        Aluno.seminario = seminario;
    }

    public void imprime(){
        System.out.println(this.name);
        if(seminario.getTitle() == null) return;
        System.out.println(seminario.getTitle());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Seminario getSeminario() {
        return seminario;
    }

    public static void setSeminario(Seminario seminario) {
        Aluno.seminario = seminario;
    }
}