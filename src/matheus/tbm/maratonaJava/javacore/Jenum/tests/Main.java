package matheus.tbm.maratonaJava.javacore.Jenum.tests;

import matheus.tbm.maratonaJava.javacore.Jenum.domains.Client;
import matheus.tbm.maratonaJava.javacore.Jenum.domains.TypeClient;
import matheus.tbm.maratonaJava.javacore.Jenum.domains.TypePayment;

public class Main {
    public static void main(String[] args) {

        Client client = new Client("Ricardo", TypeClient.PESSOA_FISICA, TypePayment.DEBITO);
        Client client1 = new Client("Richard", TypeClient.PESSOA_JURIDICA, TypePayment.CREDITO);

        System.out.println(client);
        System.out.println(client1);
        System.out.println(TypePayment.CREDITO.getDiscount(100));
        System.out.println(TypePayment.DEBITO.getDiscount(100));
        System.out.println(TypePayment.DINHEIRO.getDiscount(100));

        System.out.println("//////////////////////////////////");

        TypeClient typeClient = TypeClient.typeClientByName("Pessoa Física");
        System.out.println(typeClient);

    }
}
