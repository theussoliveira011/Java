package matheus.tbm.maratonaJava.introduction;

public class Arrays2 {
    public static void main(String[] args) {
        // byte, shorte, int, long, float e double 0
        // char '\u0000' ' '
        // boolean false
        // String null

        String[] nomes = new String[3];
        String[] nomesAoContrario = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Gohan";
        nomes[2] = "Piccolo";
        int j = 0;
        for(int i = nomes.length - 1; i >= 0 ;i--){
            nomesAoContrario[j] = nomes[i];
            j++;
        }
        System.out.println(nomesAoContrario[0]);
        System.out.println(nomesAoContrario[1]);
        System.out.println(nomesAoContrario[2]);

    }
}
