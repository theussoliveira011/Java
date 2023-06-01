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

    public void setValue(int value) {
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    //uniques methods
    public static TypeProduct addTypeProduct(TypeProduct[] types, byte inputTypeProduct){

        if(inputTypeProduct < 0 || inputTypeProduct >= types.length){
            System.out.println("Favor digite um número válido!");
            System.out.println("1 - Bolacha");
            System.out.println("2 - Higiene");
            System.out.println("3 - Alimento");
            System.out.println("4 - Farinha");
            System.out.println("5 - Fruta");
            System.out.println("6 - Legume");
        }

        for(TypeProduct type : types){
            if(type.getValue() == inputTypeProduct){
                return type;
            }
        }
        return null;
    }

    public abstract double discountToAProduct(double value);

    @Override
    public String toString() {
        return "TypeProduct{" +
                "value=" + value +
                ", text='" + text + '\'' +
                '}';
    }
}
