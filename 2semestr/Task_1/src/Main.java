import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int size1 = 2;
        int size2 = 4;

        int[][] matrix2 = new int[size1][size2];

        for (int i = 0; i < size2; i++) {
            for (int j = 0; j < size1; j++) {
                matrix2[j][i] = rnd.nextInt(10);
                System.out.print(matrix2[j][i] + " ");
            }
            System.out.println();
        }
    }
}