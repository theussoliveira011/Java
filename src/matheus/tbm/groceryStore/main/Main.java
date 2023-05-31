package matheus.tbm.groceryStore.main;

import matheus.tbm.groceryStore.domains.Client.Client;
import matheus.tbm.groceryStore.domains.Product.Product;
import matheus.tbm.groceryStore.domains.Product.TypeProduct;
import matheus.tbm.groceryStore.domains.Stock.Stock;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();

        char opcao = '0';

        Client client = new Client();

        Stock.addProduct(stock, new Product("Condicionador", TypeProduct.HIGIENE, "Item para Higienização Capilar", 10.56));
        Stock.addProduct(stock, new Product("Trakinas", TypeProduct.BOLACHA, "Bolacha Recheada de Limão", 1.99));
        Stock.addProduct(stock, new Product("Arroz", TypeProduct.ALIMENTO, "Arroz Integral", 9.99));
        Stock.addProduct(stock, new Product("Arroz", TypeProduct.ALIMENTO, "Arroz Integral", 9.99));
        Stock.addProduct(stock, new Product("Arroz", TypeProduct.ALIMENTO, "Arroz Integral", 9.99));
        Stock.addProduct(stock, new Product("Arroz", TypeProduct.ALIMENTO, "Arroz Integral", 9.99));


//        do{
//
//            products = new Product[]
//                    {
//                            product4, product7, product5,
//                            product, product1, product2, product3,
//                            product6, product8, product9, product10
//                    };
//
//
//            System.out.println("BEM VINDO AO MERCADINHO DO MATHEUS");
//
//            Scanner inputNameUser = new Scanner(System.in);
//            System.out.println("Qual seu nome?");
//
//            client.setName(inputNameUser.nextLine());
//
//            System.out.println("Olá " + client.getName());
//            System.out.println("");
//
//
//        } while(opcao != 0);

    }
}
