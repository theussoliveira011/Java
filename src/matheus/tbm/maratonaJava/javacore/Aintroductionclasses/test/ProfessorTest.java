package matheus.tbm.maratonaJava.javacore.Aintroductionclasses.test;

import matheus.tbm.maratonaJava.javacore.Aintroductionclasses.model.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Richard";
        professor.age = 35;
        professor.sexo = 'F';

        System.out.println("Name: "+professor.name+" Age:" +professor.age+" Gender:"+professor.sexo);
    }
}
