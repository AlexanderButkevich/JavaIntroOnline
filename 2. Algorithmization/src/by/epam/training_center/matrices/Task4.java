package by.epam.training_center.matrices;

public final class Task4 {
    public static int[][] solution(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n - 1; i += 2) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = j + 1;
                matrix[i+1][j] = n - j;
            }
        }
        return matrix;
    }
}
