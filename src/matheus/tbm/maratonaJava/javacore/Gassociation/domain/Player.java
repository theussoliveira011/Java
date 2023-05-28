package matheus.tbm.maratonaJava.javacore.Gassociation.domain;

public class Player {

    private String name;
    private Team team;

    public Player(String name) {
        this.name = name;
    }

    public void imprime(){
        System.out.println("-----");
        System.out.println(this.name);
        if(this.team != null){
            System.out.println(team.getName());
        }
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
