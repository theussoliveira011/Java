package matheus.tbm.maratonaJava.javacore.Pstrings.test;

public class StringPerfomance {
    public static void main(String[] args) {

        System.out.println("String: ");
        long inicio = System.currentTimeMillis();
        concatString(100_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto: "+ (fim - inicio)+"ms");

        System.out.println("===============================");

        System.out.println("String builder: ");
        inicio = System.currentTimeMillis();
        stringBuilderConcat(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto: "+ (fim - inicio)+"ms");

        System.out.println("===============================");

        System.out.println("String buffer: ");
        inicio = System.currentTimeMillis();
        stringBufferConcat(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto: "+ (fim - inicio)+"ms");
    }

    private static void concatString(int tamanho){
     String texto = "";

     for(int i = 0; i < tamanho;i++){
         texto += i; // 0, 01, 012, 0123, 01234
     }
    }

    private static void stringBuilderConcat(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);

        for(int i = 0; i < tamanho;i++){
            sb.append(i); // 0, 01, 012, 0123, 01234
        }
    }

    private static void stringBufferConcat(int tamanho){
        StringBuffer sb = new StringBuffer(tamanho);

        for(int i = 0; i < tamanho;i++){
            sb.append(i); // 0, 01, 012, 0123, 01234
        }
    }
}