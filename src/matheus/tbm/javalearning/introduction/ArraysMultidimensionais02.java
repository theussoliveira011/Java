package matheus.tbm.javalearning.introduction;

public class ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        int[][] arr = new int[3][];

        arr[0] = new int[2];
        arr[1] = array;
        arr[2] = new int[4];

        int[][] arr2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};


        for (int[] arrBase : arr2) {
            System.out.println("\n-------");
            for (int num : arrBase) {
                System.out.print(num + ", ");
            }
        }

    }
}
