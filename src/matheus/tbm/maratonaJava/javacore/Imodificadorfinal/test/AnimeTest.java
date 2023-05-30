package matheus.tbm.maratonaJava.javacore.Imodificadorfinal.test;

import matheus.tbm.maratonaJava.javacore.Imodificadorfinal.domains.Anime;
import matheus.tbm.maratonaJava.javacore.Imodificadorfinal.domains.Naruto;

public class AnimeTest {

    public static void main(String[] args) {

        Anime anime = new Anime("Naruto");
        // anime.CAPACIDADE_DE_FILMES = 100; erro -> não é possível alterar o valor de uma variável com valor final.
        // Anime.CAPACIDADE_DE_FILMES = 250;

        System.out.println(anime.getCOMPRADOR());
        anime.getCOMPRADOR().setName("Richard");
        System.out.println(anime.getCOMPRADOR());
        anime.imprime();
        Naruto naruto = new Naruto("Lesgo");
        naruto.imprime();
    }

}
