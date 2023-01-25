package matheus.tbm.javalearning.javacore.Bintroductionmethods.test;

import matheus.tbm.javalearning.javacore.Bintroductionmethods.dominio.Estudante;
import matheus.tbm.javalearning.javacore.Bintroductionmethods.dominio.ImpressoraEstudante;

public class EstudanteTest {

    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.name = "Tarzan";
        estudante01.age = 35;
        estudante01.sex = 'M';

        estudante02.name = "Jane";
        estudante02.age = 34;
        estudante02.sex = 'F';

        estudante01.imprime();
        System.out.println("=========");
        estudante02.imprime();

//        impressora.imprime(estudante01);
//        impressora.imprime(estudante02);


    }
}
