package matheus.tbm.javalearning.javacore.Fmodificatorstatic.test;

import matheus.tbm.javalearning.javacore.Fmodificatorstatic.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(180);

        Carro carro = new Carro("BMW", 400);
        Carro carro2 = new Carro("Mercedez", 500);
        Carro carro3 = new Carro("MacLaren", 700);


        carro.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
