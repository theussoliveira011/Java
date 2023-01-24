package matheus.tbm.javalearning.introduction;

public class ArraysMultidimensionais01 {
    public static void main(String[] args) {

        int[][] dias = new int [3][3];

        dias[0][0] = 31;
        dias[0][1] = 25;
        dias[0][2] = 32;

        dias[1][0] = 15;
        dias[1][1] = 27;
        dias[1][2] = 39;

        dias[2][0] = 35;
        dias[2][1] = 49;
        dias[2][2] = 39;
        int pares = 0;
        int impares = 0;

        /* For padrão */
//        for(int i = 0; i<dias.length;i++){
//            for(int j = 0; j < dias[i].length;j++){
//
//                if(dias[i][j] % 2 == 0){
//                    pares++;
//                } else {
//                    impares++;
//                }
//            }
//        }


       /* Foreach */
        for(int[] arr:dias){
            for(int num:arr){
                if(num % 2 == 0){
                    pares++;
                } else {
                    impares++;
                }
            }
        }

        System.out.println("Numeros pares: "+pares);
        System.out.println("Numeros impares: "+impares);

       // System.out.println(dias[0]); // output -> address in memory I@3fee733d
    }
}
