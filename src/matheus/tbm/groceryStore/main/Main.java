package matheus.tbm.groceryStore.main;

import matheus.tbm.groceryStore.domains.Client.Client;
import matheus.tbm.groceryStore.domains.Product.Product;
import matheus.tbm.groceryStore.domains.Product.TypeProduct;
import matheus.tbm.groceryStore.domains.Stock.Stock;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Client client = new Client();

//        for(byte i = 0; i < Stock.PRODUCTS.length; i++) System.out.println(Stock.PRODUCTS[i]);
//
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
                    System.out.println("Digite o nome do produto que deseja adicionar");
                    String inputNameProduct = new Scanner(System.in).nextLine();

                    System.out.println("Qual o tipo de produto?");
                    System.out.println("1 - Bolacha");
                    System.out.println("2 - Higiene");
                    System.out.println("3 - Alimento");
                    System.out.println("4 - Farinha");
                    System.out.println("5 - Fruta");
                    System.out.println("6 - Legume");
                    byte inputTypeProduct = new Scanner(System.in).nextByte();
                    TypeProduct typeProduct = TypeProduct.addTypeProduct(types, inputTypeProduct);

                    System.out.println("Adicione uma descrição ao produto");
                    String inputProductDescription = new Scanner(System.in).nextLine();

                    System.out.println("Qual será o preço do produto?");
                    double inputProductPrice = new Scanner(System.in).nextDouble();

                    Stock.addProduct(new Product(inputNameProduct, typeProduct, inputProductDescription, inputProductPrice));
                    break;

                case 2:
                    System.out.println("Qual o id do produto que deseja excluir?");
                    Stock.showProducts();

                    short inputOptionToRemove = new Scanner(System.in).nextShort();
                    if(inputOptionToRemove < 0 || inputOptionToRemove >= Stock.PRODUCTS.length || inputOptionToRemove > 126){
                        System.out.println("Id do produto inválido");
                        break;
                    }

                    Product optionToRemove = Stock.getProductByID(inputOptionToRemove);
                    if(optionToRemove == null){
                        System.out.println("Impossível remover!");
                    } else {
                        Stock.removeProduct(optionToRemove.getProductID());
                        System.out.println("Produto removido com sucesso!");
                    }

                    break;
            }

       } while(option != 0);
    }
}
