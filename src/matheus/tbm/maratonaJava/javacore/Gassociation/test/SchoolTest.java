package matheus.tbm.maratonaJava.javacore.Gassociation.test;

import matheus.tbm.maratonaJava.javacore.Gassociation.domain.School;
import matheus.tbm.maratonaJava.javacore.Gassociation.domain.Teacher;

public class SchoolTest {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Richarlisson");
        Teacher t2 = new Teacher("SambaRilove");
        Teacher[] teachers = {t1, t2};
        School school = new School("E.E Inspetor Pedro Madoglio");
        School school2 = new School("E.E Inspetor Reinaldo José", teachers);

        school.imprime();
        school2.imprime();
    }
}
