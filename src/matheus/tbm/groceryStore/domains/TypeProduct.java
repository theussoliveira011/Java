package matheus.tbm.groceryStore.domains;

public enum TypeProduct {
    BOLACHA(1),
    HIGIENE(2),
    ALIMENTO(3),
    FARINHA(4);

    private int value;

    TypeProduct(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
