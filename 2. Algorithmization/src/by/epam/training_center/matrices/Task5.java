package by.epam.training_center.matrices;

public final class Task5 {
    public static int[][] solution(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                    matrix[i][j] = i + 1;
            }
        }
        return matrix;
    }
}
