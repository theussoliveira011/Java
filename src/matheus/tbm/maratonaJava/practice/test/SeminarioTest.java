package matheus.tbm.maratonaJava.practice.test;

import matheus.tbm.maratonaJava.practice.domains.Aluno;
import matheus.tbm.maratonaJava.practice.domains.Local;
import matheus.tbm.maratonaJava.practice.domains.Professor;
import matheus.tbm.maratonaJava.practice.domains.Seminario;

public class SeminarioTest {
    public static void main(String[] args) {
        Local local = new Local("Rua dos bobos N°0");
        Local local2 = new Local("Rua das Orquideas");
        Local[] locals = {local, local2};


        Aluno aluno = new Aluno(1, "Jefferson");
        Aluno aluno2 = new Aluno(2, "Richard");
        Aluno aluno3 = new Aluno(3, "Luffy");
        Aluno aluno4 = new Aluno(4, "Paulinho");
        Aluno[] alunos = {aluno, aluno2, aluno3, aluno4};

        Seminario seminario1 = new Seminario("Boas práticas",alunos, local);
        Seminario seminario2 = new Seminario("5S", alunos, local2);
        Seminario[] seminarios = {seminario1, seminario2};

        Professor professor = new Professor("João", "Engenheiro de Software", seminarios);
        Professor professor2 = new Professor("Ricardo", "Arquiteto de Software", seminarios);
        Professor[] professores = {professor, professor2};

//        professor.imprime();

        Aluno encontrado = seminario1.getAlunoById(4);
        System.out.println(encontrado.getName());

    }
}
