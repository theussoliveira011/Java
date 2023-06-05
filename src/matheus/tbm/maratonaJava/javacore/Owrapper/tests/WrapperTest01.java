package matheus.tbm.maratonaJava.javacore.Owrapper.tests;

import java.util.List;

// Objetos que encapsulam tipos primitos
public class WrapperTest01 {
    public static void main(String[] args) {

        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char characterP = 'a';
        boolean booleanP = true;

        Byte byteW = 20;
        Short shortW = 1;
        Integer intW = 1; // autoboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character characterW = 'a';
        Boolean booleanW = true;

        int i = intW.intValue(); // unboxing
        Integer intW2 = Integer.parseInt("20");
        boolean verdadeiro = Boolean.parseBoolean("true");
        boolean falso = Boolean.parseBoolean("false");


        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isLetterOrDigit('#'));
//        System.out.println(verdadeiro);
//        System.out.println(falso);
//        System.out.println(byteW.toString());
    }
    
}
