package matheus.tbm.javalearning.javacore.Aintroductionclasses.test;

import matheus.tbm.javalearning.javacore.Aintroductionclasses.model.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        estudante.age = 20;
        estudante.name = "Matheus";
        estudante.gender = 'M';
        estudante.notes = new int[]{7, 7, 7, 4};

        int soma = 0;
        for(int i = 0; i<estudante.notes.length;i++){
            soma += estudante.notes[i];
        }
        double media = soma / 4;

        if(media == 10){
            System.out.println("O Estudante: "+ estudante.name+ "\n" +
                                "Idade: "+estudante.age+"\n"+
                                "Fechou o ano com a media de: "+media);
        } else if(media >= 7){
            System.out.println("O Estudante: "+ estudante.name+ "\n" +
                    "Idade: "+estudante.age+"\n"+
                    "Fechou o ano com a media de: "+media);
        } else {
            System.out.println("O Estudante: "+ estudante.name+ "\n" +
                    "Idade: "+estudante.age+"\n"+
                    "reprovou o ano com a media de: "+media);
        }
    }
}
