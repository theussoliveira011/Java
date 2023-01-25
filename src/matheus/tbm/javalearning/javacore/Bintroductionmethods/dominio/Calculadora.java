package matheus.tbm.javalearning.javacore.Bintroductionmethods.dominio;

public class Calculadora {

    public void somaDoisNumeros(double a, double b){
        System.out.println(a + b);
    }

    public double subtraiDoisNumeros(double a, double b){
        double operation = a - b;
        double result = this.verificaNumeroPar(operation);

        return result;
    }

    public void divideDoisNumeros(double a, double b){
        System.out.println(a / b);
    }

    public void multiplicaDoisNumeros(double a, double b){
        System.out.println(a * b);
    }

    public double restoDoisNumeros(double a, double b){
        double operation = a % b;
        double result = this.verificaNumeroPar(operation);

        if(b == 0){
            return 0;
        }
        return result;
    }

    public double verificaNumeroPar(double a){
        if(a % 2 == 0){
            System.out.println("Numero Par");
            return a;
        }
        System.out.println("Numero impar");
        return a;
    }
}