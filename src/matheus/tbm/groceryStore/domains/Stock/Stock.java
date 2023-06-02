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

        Product produto = getProductByID(id);
        if(produto != null){
            for(byte i = 0; i < PRODUCTS.length; i++){
                if(PRODUCTS[i] == null){
                    break;
                }
                if(PRODUCTS[i].getProductID() == produto.getProductID()){
                    PRODUCTS[i] = new Product();
                    break;
                }
            }

        } else {
        }
    }

    public static void showProducts(){
        for(byte i = 0; i < PRODUCTS.length; i++){
            if(PRODUCTS[i] != null){
                System.out.println(Stock.PRODUCTS[i].getProductID() + " " + Stock.PRODUCTS[i].getName());
            } else {
                break;
            }
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
