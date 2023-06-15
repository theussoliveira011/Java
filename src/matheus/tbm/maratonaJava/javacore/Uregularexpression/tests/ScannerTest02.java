package matheus.tbm.maratonaJava.javacore.Uregularexpression.tests;

import java.util.Scanner;

public class ScannerTest02 {

    public static void main(String[] args) {
        String text = "Naruto, Sasuke, false, Sakura, Orochimaru, Kabuto, 300";
        Scanner scanner = new Scanner(text).useDelimiter(", ");

        while(scanner.hasNext()){

            if(scanner.hasNextInt()){
                int i = scanner.nextInt();
                System.out.println("Inteiro: "+i);
            } else if(scanner.hasNextBoolean()){
                boolean b = scanner.nextBoolean();
                System.out.println("Booleano: "+b);
            } else {
                System.out.println(scanner.next());
            }

        }
    }
}
