package matheus.tbm.groceryStore.main;

import matheus.tbm.groceryStore.domains.Client;
import matheus.tbm.groceryStore.domains.Product;
import matheus.tbm.groceryStore.domains.TypeProduct;

public class Main {
    public static void main(String[] args) {

        Client client = new Client("Richard", "Barros", "Rua dos Eucaliptos n°26", (byte) 23, "29-11-1999", "matheusdesenvolvedor011@gmail.com");

        Product product = new Product("Trakinas", TypeProduct.BOLACHA, "Bolacha Recheada de Limão", 1.99);
        Product product1 = new Product("Condicionador", TypeProduct.HIGIENE, "Item para Higienização Capilar", 10.56);
        Product product2 = new Product("Arroz", TypeProduct.ALIMENTO, "Arroz Integral", 9.99);
        Product product3 = new Product("Farinha de Trigo", TypeProduct.FARINHA, "Farinha de Trigo", 10.55);
    }
}
