package matheus.tbm.maratonaJava.introduction;

public class Arrays3 {
    public static void main(String[] args) {

        int[] numeros = new int[5];
        int[] numeros02 = {1,2,3,4,5};
        int[] numeros03 = new int[]{1,2,3,4,5};

//        for (int i = 0; i<numeros03.length;i++){
//            System.out.println(numeros03[i]);
//        }
        int soma = 0;
        for(int num : numeros03){ //sintax foreach
            soma += num;
        }
        System.out.println(soma);
    }
}