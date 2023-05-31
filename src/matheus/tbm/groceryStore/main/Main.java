package matheus.tbm.groceryStore.main;

import matheus.tbm.groceryStore.domains.Client.Client;
import matheus.tbm.groceryStore.domains.Product.Product;
import matheus.tbm.groceryStore.domains.Product.TypeProduct;
import matheus.tbm.groceryStore.domains.Stock.Stock;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Client client = new Client();

//        Stock.addProduct(new Product("Condicionador", TypeProduct.HIGIENE, "Item para Higienização Capilar", 10.56));
//        Stock.addProduct(new Product("Trakinas", TypeProduct.BOLACHA, "Bolacha Recheada de Limão", 1.99));
//        Stock.addProduct(new Product("Arroz", TypeProduct.ALIMENTO, "Arroz Integral", 9.99));
//        for(byte i = 0; i < Stock.PRODUCTS.length; i++) System.out.println(Stock.PRODUCTS[i]);

        char opcao = '0';

        System.out.println("Digite seu nome:");
        String inputNameUser = new Scanner(System.in).nextLine();
        client.setName(inputNameUser);

        System.out.println("Digite seu sobrenome:");
        String inputSurnameUser = new Scanner(System.in).nextLine();
        client.setSurname(inputSurnameUser);


        String inputAnwserEmail = client.doYouHave("email");
        client.setData("email", inputAnwserEmail);

        String inputAnwserAddres = client.doYouHave("address");
        client.setData("address", inputAnwserAddres);





//        do {
//            Stock.addProduct(new Product("Condicionador", TypeProduct.HIGIENE, "Item para Higienização Capilar", 10.56));
//            Stock.addProduct(new Product("Trakinas", TypeProduct.BOLACHA, "Bolacha Recheada de Limão", 1.99));
//            Stock.addProduct(new Product("Arroz", TypeProduct.ALIMENTO, "Arroz Integral", 9.99));
//            Stock.addProduct(new Product("Feijão", TypeProduct.ALIMENTO, "Feijão de Corda", 9.99));
//            Stock.addProduct(new Product("Farinha de Trigo", TypeProduct.FARINHA, "Farinha de Trigo", 9.99));
//            Stock.addProduct(new Product("Maçã", TypeProduct.FRUTA, "Maçã", 9.99));
//            Stock.addProduct(new Product("Chuchu", TypeProduct.LEGUME, "Chuchu", 9.99));
//
//            System.out.println("BEM VINDO AO MERCADINHO DO MATHEUS");
//
//        } while(opcao != 0);
    }
}
