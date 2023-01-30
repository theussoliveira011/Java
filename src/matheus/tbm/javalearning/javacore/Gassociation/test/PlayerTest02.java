package matheus.tbm.javalearning.javacore.Gassociation.test;

import matheus.tbm.javalearning.javacore.Gassociation.domain.Player;
import matheus.tbm.javalearning.javacore.Gassociation.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player p1 = new Player("Cafu");
        Player p2 = new Player("Richarlisson");
        Player[] players = {p1, p2};

        Team team = new Team("Seleção Brasileira");
        team.setPlayers(players);

        p1.setTeam(team);
        p2.setTeam(team);

        System.out.println("--- Player ---");
        p1.imprime();
        p2.imprime();

        System.out.println("--- Team ---");
        team.imprime();
    }
}