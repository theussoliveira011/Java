package matheus.tbm.maratonaJava.javacore.Nexeceptions.runtime.tests;

public class RuntimeExceptionTest02 {

    public static void main(String[] args) {
        divisao(1, 0);
    }

    public static int divisao(int a, int b) throws IllegalArgumentException {
        if(b == 0){
            throw new IllegalArgumentException("Não pode ser zero doidão!!!");
        }

        return a/b;
//        try {
//            return a/b;
//        }
//        catch (RuntimeException error) {
//            error.printStackTrace();
//        }
//        System.out.println("HelloBoy");
//        return 0;
    }
}
