package matheus.tbm.maratonaJava.javacore.Tresourcebundle.tests;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
    public static void main(String... args){
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        System.out.println(bundle.getString("hi"));
        System.out.println("=========================");
        bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        System.out.println(bundle.getString("hi"));

        System.out.println("===========================");

        new Locale("fr", "CA");
        // messages_fr_CA.properties
        // messages_fr.properties
        // messages_en_US.properties
        // messages_en.properties
        // messages.properties
    }
}
