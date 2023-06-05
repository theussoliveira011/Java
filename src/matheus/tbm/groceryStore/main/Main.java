package matheus.tbm.groceryStore.main;

import matheus.tbm.groceryStore.domains.Client.Client;
import matheus.tbm.groceryStore.domains.Menu.Options;
import matheus.tbm.groceryStore.domains.Product.Product;
import matheus.tbm.groceryStore.domains.Product.TypeProduct;
import matheus.tbm.groceryStore.domains.Stock.Stock;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Client client = new Client();


//        System.out.println("Digite seu nome:");
//        String inputNameUser = new Scanner(System.in).nextLine();
//        client.setName(inputNameUser);
//
//        System.out.println("Digite seu sobrenome:");
//        String inputSurnameUser = new Scanner(System.in).nextLine();
//        client.setSurname(inputSurnameUser);
//
//        System.out.println("Olá "+client.getName()+ " " +client.getSurname());
//
//        String inputAnwserEmail = client.doYouHave("email");
//        client.setData("email", inputAnwserEmail);
//
//        String inputAnwserAddres = client.doYouHave("address");
//        client.setData("address", inputAnwserAddres);
//
//

        System.out.println("BEM VINDO AO MERCADINHO DO MATHEUS");

        // Alimentando o "banco de dados";
        Stock.addProduct(new Product("Trakinas", TypeProduct.BOLACHA, "Bolacha Recheada de Limão", 1.99));
        Stock.addProduct(new Product("Arroz", TypeProduct.ALIMENTO, "Arroz Integral", 25));
        Stock.addProduct(new Product("Feijão", TypeProduct.ALIMENTO, "Feijão de Corda", 20));
        Stock.addProduct(new Product("Farinha de Trigo", TypeProduct.FARINHA, "Farinha de Trigo", 15));
        Stock.addProduct(new Product("Maçã", TypeProduct.FRUTA, "Maçã", 10.3));
        Stock.addProduct(new Product("Chuchu", TypeProduct.LEGUME, "Chuchu", 10.5));
        Stock.addProduct(new Product("Condicionador", TypeProduct.HIGIENE, "Item para Higienização Capilar", 10.56));
        Stock.addProduct(new Product("Trakinas", TypeProduct.BOLACHA, "Bolacha Recheada de Limão", 1.99));
        Stock.addProduct(new Product("Feijão", TypeProduct.ALIMENTO, "Feijão preto", 9.99));
        Stock.addProduct(new Product("Shampoo", TypeProduct.HIGIENE, "Shampoo Johnson's Baby", 35.25));
        Stock.addProduct(new Product("Condicionador", TypeProduct.HIGIENE, "Condicionador Johnson's Baby", 30));
        Stock.addProduct(new Product("Fralda", TypeProduct.HIGIENE, "Fralda Johnson's Baby", 30));
        Stock.addProduct(new Product("Giló", TypeProduct.LEGUME, "Giló", 5));
        Stock.addProduct(new Product("Condicionador", TypeProduct.HIGIENE, "Condicionador Johnson's Baby", 30));

        byte option;
        TypeProduct[] types = TypeProduct.values();

        do
        {
            System.out.println(client.getName() + " Por favor, digite o número de uma das opções abaixo");
            System.out.println("0 - Para encerrar o programa");
            System.out.println("1 - Adicionar um Produto");
            System.out.println("2 - Remover um Produto");

            option = new Scanner(System.in).nextByte();

            switch(option)
            {
                case 1:
                    Options.addProduct(types);
                    break;

                case 2:
                    Options.removeProduct();
                    break;

                case 3:

                    break;
            }

       } while(option != 0);
    }
}
