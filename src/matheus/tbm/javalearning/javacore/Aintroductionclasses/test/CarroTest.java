package matheus.tbm.javalearning.javacore.Aintroductionclasses.test;

import matheus.tbm.javalearning.javacore.Aintroductionclasses.model.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.name = "Honda";
        carro.model = "SUV";
        carro.year = 2023;
        System.out.println("name: "+carro.name+" model: "+carro.model+" year: "+carro.year);

        System.out.println("=====================================================");

        carro2.name = "FIAT";
        carro2.model = "SUV";
        carro2.year = 2015;
        System.out.println("name: "+carro2.name+" model: "+carro2.model+" year: "+carro2.year);

    }
}
