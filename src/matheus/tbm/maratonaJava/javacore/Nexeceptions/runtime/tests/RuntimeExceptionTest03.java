package matheus.tbm.maratonaJava.javacore.Nexeceptions.runtime.tests;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
            read();
        System.out.println(openConnection());
    }

    private static void read(){
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo no arquivo");
        } catch(Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        };
    }

    private static String openConnection(){
        try {
            System.out.println("Abrindo conexão");
            System.out.println("Estabelecendo conexão");
            return "Conexão aberta!";
        } catch (Exception e){
            e.printStackTrace();
        } finally {
        System.out.println("Liberando recursos na memória...");
        return "";
        }
    }
}
