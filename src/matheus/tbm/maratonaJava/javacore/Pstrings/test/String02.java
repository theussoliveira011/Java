package matheus.tbm.maratonaJava.javacore.Pstrings.test;

public class String02 {
    public static void main(String[] args) {
        String name = "math";
        System.out.println(name.charAt(3));
        System.out.println(name.replace("t", "k"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        String name2 = "  012345  ";
        System.out.println(name2.length());
        System.out.println(name2.substring(0, name2.length() - 1));
        System.out.println(name2.substring(0, name2.length()));
        System.out.println(name2);
        System.out.println(name2.trim().substring(3));
    }
}