package matheus.tbm.maratonaJava.javacore.Gassociation.test;

import matheus.tbm.maratonaJava.javacore.Gassociation.domain.Player;
import matheus.tbm.maratonaJava.javacore.Gassociation.domain.Team;

public class PlayerTest {

    public static void main(String[] args) {
        Player p1 = new Player("Richarde");
        Team team = new Team("Santos");

        p1.setTeam(team);
        p1.imprime();

//        Player p2 = new Player("Neymar");
//        Player p3 = new Player("Pelé");
//        Player[] players = new Player[]{p1, p2, p3};

//        for(Player player : players){
//            player.imprime();
//        }

    }
}
