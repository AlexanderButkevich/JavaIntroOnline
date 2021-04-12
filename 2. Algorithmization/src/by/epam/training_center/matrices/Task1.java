package by.epam.training_center.matrices;

public final class Task1 {
    public static void solution(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int j = 0; j < cols; j += 2) {
            if (matrix[0][j] > matrix[rows-1][j]) {
                for (int i = 0; i < rows; i++) {
                    System.out.printf("a[%d;%d]=%d\n", i+1, j+1, matrix[i][j]);
                }
                System.out.println();
            }
        }
    }
}
