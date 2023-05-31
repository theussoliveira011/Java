package matheus.tbm.groceryStore.domains.Stock;

import matheus.tbm.groceryStore.domains.Product.Product;

public class Stock {

    public final Product[] PRODUCTS = new Product[100];
    private static short stockCounter;


    public static void addProduct(Stock stock, Product product){
        stockCounter = (short) (Product.getProductCounter() - 1);
        stock.PRODUCTS[stockCounter] = product;
    }

}
