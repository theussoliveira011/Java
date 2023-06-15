package matheus.tbm.maratonaJava.javacore.Uregularexpression.tests;

public class ScannerTest01 {

    public static void main(String[] args) {
        String text = "Naruto, Sasuke, Sakura";
        String[] split = text.split(",");
        for (String s : split) {
            System.out.println(s.trim());
        }

    }
}
