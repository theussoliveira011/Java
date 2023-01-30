package matheus.tbm.javalearning.javacore.Gassociation.test;

import java.util.Scanner;

public class LeituraDoTecladoTest {
    public static void main(String[] args) {
        System.out.println("--- Previsão do futuro ---");
        System.out.println("Digite uma pergunta e responderei sim ou não");
        Scanner input = new Scanner(System.in);
        String question = input.nextLine();

        if(question.charAt(0) == ' '){
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
    }
}
