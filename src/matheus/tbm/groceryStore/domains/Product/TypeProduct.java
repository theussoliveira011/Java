package matheus.tbm.groceryStore.domains.Product;

public enum TypeProduct {
    BOLACHA(1, "Bolacha") {
        @Override
        public double discountToAProduct(double price) {
            return price * 0.05;
        }
    },
    HIGIENE(2, "Higiene"){
        @Override
        public double discountToAProduct(double price) {
            return price * .05;
        }

    },
    ALIMENTO(3, "Alimento"){
        @Override
        public double discountToAProduct(double price) {
            return price * .1;
        }
    },
    FARINHA(4, "Farinha"){
        @Override
        public double discountToAProduct(double price) {
            return price * .04;
        }
    },
    FRUTA(5, "Fruta"){
        @Override
        public double discountToAProduct(double price) {
            return price * .09;
        }
    },
    LEGUME(6, "Legume"){
        @Override
        public double discountToAProduct(double price) {
            return price * 0.01;
        }
    };

    private int value;
    private String text;

    TypeProduct(int value, String text){
        this.value = value;
        this.text = text;
    }

    public int getValue() {
        return value;
    }

    //uniques methods
    public abstract double discountToAProduct(double value);

    @Override
    public String toString() {
        return "TypeProduct{" +
                "value=" + value +
                ", text='" + text + '\'' +
                '}';
    }
}
