package matheus.tbm.maratonaJava.javacore.Pstrings.test;

public class String01 {
    public static void main(String[] args) {
        // Strings são imutáveis.
        String name = "Matheus"; // String constant pool
        String name2 = "Matheus"; // String constant pool
//        name = name.concat(" Suane");
//        name2 = name2.concat(" Suane");
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name == name2);

        String name3 = new String("Matheus"); // 1 - variável de referência, 2 - Um objeto do tipo String, 3 - uma String no pool de Strings.
        System.out.println(name2 == name3);
        System.out.println(name2 == name3.intern());

    }
}