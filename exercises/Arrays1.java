package matheus.tbm.maratonaJava.introduction;

public class Arrays1 {
    public static void main(String[] args) {

        int[] idades = {30, 40, 50, 10, 15, 35, 18};
        int maioresDeIdade = 0;
        int menoresDeIdade = 0;
        for(int i = 0; i<idades.length;i++){

            if(idades[i] <= 18){
                menoresDeIdade++;
            } else {
                maioresDeIdade++;
            }
        }
        System.out.println("The amount of adults is: "+maioresDeIdade);
        System.out.println("The amount of kids is: "+menoresDeIdade);
    }
}
