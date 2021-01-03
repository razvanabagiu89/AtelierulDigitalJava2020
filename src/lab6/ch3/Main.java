package lab6.ch3;

public class Main {
    public static void main(String[] args) {
        // simulate Bell Triangle with a matrix
        int[][] matrix = new int[5][5];
        // first elem
        matrix[0][0] = 1;
        // compute other elems
        for(int i = 1; i < 5; i++) {
            matrix[i][0] = matrix[i-1][i-1];
            for(int j = 1; j <= i; j++) {
                matrix[i][j] = matrix[i-1][j-1] +
                        matrix[i][j-1];
            }
        }
        // print
        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }

    }
}
