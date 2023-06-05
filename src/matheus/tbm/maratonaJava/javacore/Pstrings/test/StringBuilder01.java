package matheus.tbm.maratonaJava.javacore.Pstrings.test;

public class StringBuilder01 {
    public static void main(String[] args) {
        String name = "Matheus Oliveira";
        name = name.substring(0, name.indexOf(" "));
        System.out.println(name);

        StringBuilder sb = new StringBuilder("Matheus Oliveira");
        sb.append(" DevDojo").append(" Oliveira");
        sb.reverse();
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb);

        String hello = sb.substring(0, sb.indexOf(" "));
        System.out.println(hello);
    }
}
