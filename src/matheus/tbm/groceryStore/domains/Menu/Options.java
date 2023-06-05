package matheus.tbm.groceryStore.domains.Menu;

import matheus.tbm.groceryStore.domains.Product.Product;
import matheus.tbm.groceryStore.domains.Product.TypeProduct;
import matheus.tbm.groceryStore.domains.Stock.Stock;
import java.util.Scanner;

public class Options implements Menu{

    // methods;
    public static void addProduct(TypeProduct[] types){

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
    }

    public static void removeProduct(){
        System.out.println("Qual o id do produto que deseja excluir?");
        Stock.showProducts();

        short inputOptionToRemove = new Scanner(System.in).nextShort();

        if(inputOptionToRemove < 0 || inputOptionToRemove >= Stock.PRODUCTS.length || inputOptionToRemove > 126){
            System.out.println("Este ID é inválido!");
            return;
        }

        Product optionToRemove = Stock.getProductByID(inputOptionToRemove);
        if(optionToRemove != null){
            Stock.removeProduct(optionToRemove.getProductID());
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Impossível remover!");
        }
    }

    public static void editProduct(){
        System.out.println("Qual o id do produto que deseja editar?");
        Stock.showProducts();

        byte optionToEdit = new Scanner(System.in).nextByte();
        if(optionToEdit < 0 || optionToEdit >= Stock.PRODUCTS.length){
            System.out.println("Opção inválida!");
            return;
        }

        Product productToEdit = Stock.getProductByID(optionToEdit);
        System.out.println(productToEdit);

    }

}
