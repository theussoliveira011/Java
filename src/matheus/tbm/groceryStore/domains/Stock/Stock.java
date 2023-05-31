package matheus.tbm.groceryStore.domains.Stock;

import matheus.tbm.groceryStore.domains.Product.Product;


public class Stock {

    public static final Product[] PRODUCTS = new Product[100];
    private static short stockCounter;


    //unique methods
    public static Product getProductByID(short id){
        if(PRODUCTS == null || id < 0 || id >= PRODUCTS.length){
            System.out.println("Não é póssivel buscar esse produto!");
        }

        for(Product product : PRODUCTS){
            if(product.getProductID() == id) return product;
        }

        return null;
    }

    public static void addProduct(Product product){
        stockCounter = (short) (Product.getProductCounter() - 1);
        PRODUCTS[stockCounter] = product;
    }

    public static void removeProduct(short id){
        if(PRODUCTS == null || id < 0 || id >= PRODUCTS.length){
            System.out.println("Não é possível remover nenhum produto do Estoque");
            return;
        }

        for(short i = 0; i < PRODUCTS.length; i++){
            if (PRODUCTS[i].getProductID() == id){
                PRODUCTS[i] = null;
                break;
            }

        }

    }

}
