package matheus.tbm.javalearning.javacore.Csobrecargamethods.test;

import matheus.tbm.javalearning.javacore.Csobrecargamethods.dominios.Animal;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.init("Ricardin", "Cachorro", 4, 'M');

//        animal.setSex('M');
//        animal.setName("Ricardin");
//        animal.setTipo("Cachorro");
//        animal.setQuantidadePatas(4);

        animal.imprime();
    }
}
