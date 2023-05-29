package matheus.tbm.groceryStore.main;

import matheus.tbm.groceryStore.domains.Client;
import matheus.tbm.groceryStore.domains.Product;

public class Main {

    public static void main(String[] args) {

        Client client = new Client("Richard", "Barros", "Rua dos Eucaliptos n°26", (byte) 23, "29-11-1999", "matheusdesenvolvedor011@gmail.com");
        Product product = new Product("Trakinas", "Bolacha", "Bolacha Recheada", 1.99);

    }
}
