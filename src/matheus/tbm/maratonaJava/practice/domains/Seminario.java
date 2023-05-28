package matheus.tbm.maratonaJava.practice.domains;

public class Seminario {
    private String title;
    private Aluno[] aluno;
    private Local local;

    public Seminario(String title, Local local) {
        this.title = title;
        this.local = local;
    }

    public Seminario(String title, Aluno[] aluno, Local local){
        this.title = title;
        this.aluno = aluno;
        this.local = local;
    }
    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Aluno getAlunoById(int Id) {

        for(int i = 0; i < aluno.length;i++){
            if(aluno[i].Id == Id){
                System.out.println("Aluno está presente!");
                return aluno[i];
            }
        }
        System.out.println("Aluno não está presente!");
        return null;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }
}
