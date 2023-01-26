package matheus.tbm.javalearning.javacore.Dconstructors.test;


import matheus.tbm.javalearning.javacore.Dconstructors.dominios.Animal;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal("Richard", "Tubarão", 0, 'F');




//        animal.init("Ricardin", "Cachorro", 4, 'M');
//        animal.setSex('M');
//        animal.setName("Ricardin");
//        animal.setTipo("Cachorro");
//        animal.setQuantidadePatas(4);

        animal.imprime();
    }
}
