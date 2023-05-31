package matheus.tbm.groceryStore.domains.Product;

public enum TypeProduct {
    BOLACHA(1, "Bolacha"),
    HIGIENE(2, "Higiene"),
    ALIMENTO(3, "Alimento"),
    FARINHA(4, "Farinha"),
    FRUTA(5, "Fruta"),
    LEGUME(6, "Legume");

    private int value;
    private String text;

    TypeProduct(int value, String text){
        this.value = value;
        this.text = text;
    }

    public int getValue() {
        return value;
    }
}
