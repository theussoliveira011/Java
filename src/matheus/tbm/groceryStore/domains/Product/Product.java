package matheus.tbm.groceryStore.domains.Product;

import matheus.tbm.groceryStore.domains.Stock.Stock;

import java.util.Objects;

public class Product {

    //attributes
    private short productID;
    private static short productCounter = 0;
    private String name;
    private TypeProduct typeProduct;
    private String description;
    private double price;

    {
        this.productID = productCounter;
        productCounter++;
    }

    //constructors
    public Product(){}
    public Product(String name){
        this.name = name;
    }
    public Product(String name, TypeProduct typeProduct){
        this.name = name;
        this.typeProduct = typeProduct;
    }
    public Product(String name, TypeProduct typeProduct, String description){
        this.name = name;
        this.typeProduct = typeProduct;
        this.description = description;
    }
    public Product(String name, TypeProduct typeProduct, String description, double price){
        this.name = name;
        this.typeProduct = typeProduct;
        this.description = description;
        this.price = price;
    }

    public static short getProductCounter() {
        return productCounter;
    }

    public short getProductID() {
        return productID;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public TypeProduct getTypeProduct() {
        return typeProduct;
    }
    public void setTypeProduct(TypeProduct typeProduct){
        this.typeProduct = typeProduct;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }


    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }


    //unique methods

    //override methods
    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Product) {
            Product p = (Product) obj;
            return this.name.equals(p.getName()) || this.typeProduct.equals(p.getTypeProduct());
        }

        return false;
    }
    @Override
    public int hashCode() {
        return Objects.hash(productID, name, description, price);
    }
    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", name='" + name + '\'' +
                ", typeProduct='" + typeProduct + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
